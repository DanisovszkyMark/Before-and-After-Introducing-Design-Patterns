package calculator;

/**
 * A szorzás művelet megvalósítása.
 *
 * @author danisovszky.mark
 */
public class Multiplication extends OperationStrategy {

    @Override
    protected boolean canBePerformed() {
        return true;
    }

    @Override
    protected double makeResult() {
        return a * b;
    }

    /**
     * Konstans beállítása.
     */
    public Multiplication() {
        super('*');
    }
}