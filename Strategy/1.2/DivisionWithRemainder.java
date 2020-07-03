package calculator;

/**
 * A maradékos osztás megvalósítása.
 *
 * @author danisovszky.mark
 */
public class DivisionWithRemainder extends OperationStrategy {

    @Override
    protected boolean canBePerformed(double a, double b) {
        return b != 0;
    }

    @Override
    protected double makeResult(double a, double b) {
        return a % b;
    }
}