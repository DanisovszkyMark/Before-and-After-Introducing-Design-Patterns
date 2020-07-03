package calculator;

/**
 * Az összeadás művelet megvalósítása.
 *
 * @author danisovszky.mark
 */
public class Summation extends OperationStrategy {

    @Override
    public boolean canBePerformed() {
        return true;
    }

    @Override
    public double makeResult() {
        return a + b;
    }

    /**
     * Konstans beállítása.
     */
    public Summation() {
        super('+');
    }
}