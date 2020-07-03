package calculator;

/**
 * A kétoperandusú operátorok közös felülete.
 *
 * @author danisovszky.mark
 */
public abstract class OperationStrategy {

    /**
     * Azok az elemek, melyek szükségesek a kiemeléshez.
     */
    protected double a;
    protected double b;
    protected char operator;

    /**
     * Meg kell kapnunk az objektumösszetételkor a szükséges adatokat, hogy fel tudjuk azokat használni.
     */
    public void initialization(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * A döntést hívó fő metódus kiemelése.
     */
    public double calculate() {
        if (!this.canBePerformed()) {
            System.out.println("Unknown operation or the operator can't be performed.");
            return 0;
        }

        return this.makeResult();
    }

    /**
     * Azok a metódusok, melyekben szerepelt a redundáns if mind abstract.
     */
    protected abstract boolean canBePerformed();
    protected abstract double makeResult();

    /**
     * A konstansokat a gyerekosztályok állítják be az adott eset lekezelése alapján.
     */
    protected OperationStrategy(char operator) {
        this.operator = operator;
    }
}