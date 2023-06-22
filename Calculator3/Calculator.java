import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = getLogger(Calculator.class);

    private ArithmeticStrategy strategy;

    public Calculator(AddStrategy addStrategy) {
        this.strategy = addStrategy;
    }

    public Calculator(DivideStrategy divideStrategy) {
    }

    public Calculator(MultiplyStrategy multiplyStrategy) {
    }

    public void setStrategy(ArithmeticStrategy strategy) {
        this.strategy = strategy;
        logger.info("Strategy changed to " + strategy.getClass().getSimpleName());
    }

    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = strategy.execute(num1, num2);
        logger.info("Operation: " + num1 + " " + strategy + " " + num2 + " = " + result);
        return result;
    }

    public void setStrategy(MultiplyStrategy multiplyStrategy) {
    }

    public void setStrategy(DivideStrategy divideStrategy) {
    }
}