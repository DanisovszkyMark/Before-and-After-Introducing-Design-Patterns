package calculator;

/**
 * A kivonás művelet megvalósítása.
 *
 * @author danisovszky.mark
 */
public class Subtraction extends OperationStrategy {

    @Override
    protected boolean canBePerformed() {
        return true;
    }

    @Override
    protected double makeResult() {
        return a - b;
    }

    /**
     * Konstans beállítása.
     */
    public Subtraction() {
        super('-');
    }
}