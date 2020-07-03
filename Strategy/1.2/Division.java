package calculator;

/**
 * Az osztás művelet megvalósítása.
 *
 * @author danisovszky.mark
 */
public class Division extends OperationStrategy {

    @Override
    protected boolean canBePerformed(double a, double b) {
        return b != 0;
    }

    @Override
    protected double makeResult(double a, double b) {
        return a / b;
    }
}