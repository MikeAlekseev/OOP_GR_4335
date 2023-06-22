public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // геттеры и сеттеры

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imag + other.imag);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imag * other.imag);
        double newImag = (this.real * other.imag) + (this.imag * other.real);
        return new ComplexNumber(newReal, newImag);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = (Math.pow(other.real, 2) + Math.pow(other.imag, 2));
        if (denominator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        double newReal = ((this.real * other.real) + (this.imag * other.imag)) / denominator;
        double newImag = ((this.imag * other.real) - (this.real * other.imag)) / denominator;
        return new ComplexNumber(newReal, newImag);
    }

    @Override
    public String toString() {
        return real + "+" + imag + "i";
    }
}