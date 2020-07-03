package calculator;

/**
 * A maradékos osztás megvalósítása.
 *
 * @author danisovszky.mark
 */
public class DivisionWithRemainder extends OperationStrategy {

    @Override
    protected boolean canBePerformed() {
        return b != 0;
    }

    @Override
    protected double makeResult() {
        return a % b;
    }

    /**
     * Konstans beállítása.
     */
    public DivisionWithRemainder() {
        super('%');
    }
}