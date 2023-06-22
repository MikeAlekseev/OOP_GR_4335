import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        ComplexNumber num1 = number.ComplexNumber();
        ComplexNumber num2 = number.ComplexNumber();
    
        Calculator calculator = new Calculator(new AddStrategy());
        calculator.execute(num1, num2);
    
        Calculator calculator = new Calculator(new MultiplyStrategy());
        calculator.execute(num1, num2);
    
        Calculator calculator = new Calculator(new DivideStrategy());
        calculator.execute(num1, num2);
    }
}
