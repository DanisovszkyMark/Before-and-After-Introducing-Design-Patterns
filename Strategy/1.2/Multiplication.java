package calculator;

/**
 * A szorzás művelet megvalósítása.
 *
 * @author danisovszky.mark
 */
public class Multiplication extends OperationStrategy {

    @Override
    protected boolean canBePerformed(double a, double b) {
        return true;
    }

    @Override
    protected double makeResult(double a, double b) {
        return a * b;
    }
}