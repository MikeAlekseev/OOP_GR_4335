// Класс комплексного числа

public class ComplexNumber {
    private double realPart; // действительная часть
    private double imaginaryPart; // мнимая часть
    /**
     * Конструктор, создающий комплексное число с заданными действительной и мнимой частями.
     * @param realPart действительная часть комплексного числа
     * @param imaginaryPart мнимая часть комплексного числа
     */

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    /**
     * @return строковое представление комплексного числа
     */

    @Override
    public String toString() {
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else {
            return realPart + " - " + (-imaginaryPart) + "i";
        }
    }

    /**
     * @return действительная часть комплексного числа
     */

    public double getReal() {
        return realPart;
    }

    /**
     * @return мнимая часть комплексного числа
     */

    public double getImaginary() {
        return imaginaryPart;
    }
}
