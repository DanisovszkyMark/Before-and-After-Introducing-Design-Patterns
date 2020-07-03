package calculator;

/**
 * Az osztás művelet megvalósítása.
 *
 * @author danisovszky.mark
 */
public class Division extends OperationStrategy {

    @Override
    protected boolean canBePerformed() {
        return b != 0;
    }

    @Override
    protected double makeResult() {
        return a / b;
    }

    /**
     * Konstans beállítása.
     */
    public Division() {
        super('/');
    }
}