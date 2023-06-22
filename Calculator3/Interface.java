public class Interface {
    public class AddStrategy implements ArithmeticStrategy {
        @Override
        public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
            return num1.add(num2);
        }
    
        @Override
        public String toString() {
            return "+";
        }
    }
    
    public class MultiplyStrategy implements ArithmeticStrategy {
        @Override
        public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
            return num1.multiply(num2);
        }
    
        @Override
        public String toString() {
            return "*";
        }
    }
    
    public class DivideStrategy implements ArithmeticStrategy {
        @Override
        public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
            return num1.divide(num2);
        }
    
        @Override
        public String toString() {
            return "/";
        }
    }
}
