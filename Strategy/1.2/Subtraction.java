package calculator;

/**
 * A kivonás művelet megvalósítása.
 *
 * @author danisovszky.mark
 */
public class Subtraction extends OperationStrategy {

    @Override
    protected boolean canBePerformed(double a, double b) {
        return true;
    }

    @Override
    protected double makeResult(double a, double b) {
        return a - b;
    }
}