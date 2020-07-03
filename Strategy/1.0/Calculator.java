package calculator;

/**
 * 2 operandusú matematikai műveleteket kiszámító osztály.
 *
 * @author danisovszky.mark
 */
public class Calculator {

    private double a;
    private double b;
    private char operator;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double calculate() {
        if (!this.canBePerformed()) {
            System.out.println("Unknown operation or the operator can't be performed.");
            return 0;
        }

        return this.makeResult();
    }

    private boolean canBePerformed() {
        if (operator == '+') {
            return true;
        }
        else if (operator == '-') {
            return true;
        }
        else if (operator == '*') {
            return true;
        }
        else if (operator == '/') {
            return b != 0;
        }
        else if (operator == '%') {
            return b != 0;
        }
        else {
            return false;
        }
    }

    private double makeResult() {
        if (operator == '+') {
            return a + b;
        }
        else if (operator == '-') {
            return a - b;
        }
        else if (operator == '*') {
            return a * b;
        }
        else if (operator == '/') {
            return a / b;
        }
        else if (operator == '%') {
            return a % b;
        }
        else {
            return 0;
        }
    }
}