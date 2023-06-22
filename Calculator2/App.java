import java.util.Scanner;

// Основной класс приложения для взаимодействий пользователя и операций калькулятора.
public class App {
    
    public Scanner scanner = new Scanner(System.in);

    /**
     * Метод main, точка входа в приложение.
     * 
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        // Создание объектов View & Calculator
        View view = new View();
        Calculator calculator = new Calculator();

        int choice = 0;
        while (choice != 4) {
            // Вывод меню на экран и получение выбора пользователя
            view.showMenu();
            choice = view.getMenuChoice();

            // Выбор операции пользователем
            switch (choice) {
                case 1:
                    // Получение двух комплексных чисел и выполнение операции
                    // сложения
                    ComplexNumber num1 = view.getComplexNumber();
                    ComplexNumber num2 = view.getComplexNumber();
                    calculator.setOperation(new LoggingDecorator(OperationFactory.createOperation("add")));
                    ComplexNumber sum = calculator.execute(num1, num2);
                    break;
                case 2:
                    // Получение двух комплексных чисел и выполнение операции
                    // деления
                    ComplexNumber num3 = view.getComplexNumber();
                    ComplexNumber num4 = view.getComplexNumber();
                    calculator.setOperation(new LoggingDecorator(OperationFactory.createOperation("divide")));
                    ComplexNumber div = calculator.execute(num3, num4);
                    break;
                case 3:
                    // Получение двух комплексных чисел и выполнение операции
                    // умножения
                    ComplexNumber num5 = view.getComplexNumber();
                    ComplexNumber num6 = view.getComplexNumber();
                    calculator.setOperation(new LoggingDecorator(OperationFactory.createOperation("multiply")));
                    ComplexNumber mult = calculator.execute(num5, num6);
                    break;
                case 4:
                    // Вывод сообщения выхода
                    System.out.println("Выход");
                    break;
                default:
                    // Вывод сообщения об ошибке при неравильном выборе
                    System.out.println("Неправильный выбор");
            }
        }
    }
}
