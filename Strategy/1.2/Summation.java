package calculator;

/**
 * Az összeadás művelet megvalósítása.
 *
 * @author danisovszky.mark
 */
public class Summation extends OperationStrategy {

    @Override
    public boolean canBePerformed(double a, double b) {
        return true;
    }

    @Override
    public double makeResult(double a, double b) {
        return a + b;
    }
}