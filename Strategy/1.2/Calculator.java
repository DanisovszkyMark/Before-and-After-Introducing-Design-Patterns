package calculator;

/**
 * 2 operandusú matematikai műveleteket kiszámító osztály mely stratégiát használ.
 *
 * @author danisovszky.mark
 */
public class Calculator {

    private double a;
    private double b;
    private OperationStrategy operationStrategy; // HAS-A

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    /**
     * Dependency Injection
     */
    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public double calculate() {
        return this.operationStrategy.calculate(a, b);
    }
}