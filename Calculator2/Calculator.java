// Класс для работы с комплексными числами
public class Calculator {
    private iOperation operation;
    /**
     * Метод для установки операции
     * @param operation выполняющаяся операция
     */
    public void setOperation(iOperation operation) {
        this.operation = operation;
    }
    /**
     * Метод для выполнения операции над комплексными числами
     * @param a первое комплексное число
     * @param b второе комплексное число
     * @return результат выполнения операции
     * @throws IllegalStateException если операция не установлена
     */
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        if (operation == null) {
            throw new IllegalStateException("Operation is not set");
        }
        return operation.execute(a, b);
    }
}
