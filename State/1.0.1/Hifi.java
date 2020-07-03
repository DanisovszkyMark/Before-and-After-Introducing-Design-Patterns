package hifi;

/**
 * Hifi osztály a zene lejátszására.
 *
 * Állapotok:
 * - 0 : Kikapcsolt állapot.
 * - 1 : Bekapcsolt állapot.
 * - 2 : Zene lejátszási állapot.
 *
 * @author danisovszky.mark
 */
public class Hifi {

    private int state;

    public void pressPlay() {
        if (state == 0) {
            state = 1;
            System.out.println("Turned on!");
        }
        else if (state == 1) {
            state = 2;
            System.out.println("Play music.");
        }
        else if (state == 2) {
            state = 1;
            System.out.println("Stop music.");
        }
    }

    public void pressStop() {
        if (state == 0) {
            state = 0; // Ezt nem kellene megcsinálni
            System.out.println("Nothing happened!");
        }
        else if (state == 1) {
            state = 0;
            System.out.println("Turned off!");
        }
        else if (state == 2) {
            state = 1;
            System.out.println("Stop music.");
        }
    }

    public void pressNext() {
        if (state == 0) {
            state = 0; // Ezt nem kellene megcsinálni
            System.out.println("Nothing happened!");
        }
        else if (state == 1) {
            state = 1; // Ezt nem kellene megcsinálni
            System.out.println("Next song!");
        }
        else if (state == 2) {
            state = 2;
            System.out.println("Change song.");
        }
    }

    public Hifi() {
        state = 0;
    }
}