// Интерфейс выполнения операций комплексных чисел.

public interface iOperation {
    
    /**
     * Выполнение операции над комплексными числами.
     * @param a Первое комплексное число.
     * @param b Второе комплексное число.
     * @return Результат операции в виде комплексного числа.
     */
    ComplexNumber execute(ComplexNumber a, ComplexNumber b);
}