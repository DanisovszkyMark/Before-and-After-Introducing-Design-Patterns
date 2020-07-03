package calculator;

/**
 * A kétoperandusú operátorok közös felülete.
 *
 * Stateless megvalósítás.
 *
 * @author danisovszky.mark
 */
public abstract class OperationStrategy {

    /**
     * A döntést hívó fő metódus kiemelése.
     */
    public double calculate(double a, double b) {
        if (!this.canBePerformed(a, b)) {
            System.out.println("Unknown operation or the operator can't be performed.");
            return 0;
        }

        return this.makeResult(a, b);
    }

    /**
     * Azok a metódusok, melyekben szerepelt redundáns if mind abstract.
     */
    protected abstract boolean canBePerformed(double a, double b); // Ide elegendő a b-t bekérni jelenleg. Az algoritmus is így csinálná.
    protected abstract double makeResult(double a, double b);
}