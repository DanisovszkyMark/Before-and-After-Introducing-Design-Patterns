package hifi;

/**
 * Kikapcsolt állapot (0) megvalósítása.
 *
 * @author danisovszky.mark
 */
public class TurnedOff extends HifiState {

    @Override
    public void pressPlay(Hifi hifi) {
        System.out.println("Turned on!");
        hifi.setState(hifi.getTurnedOn());
    }

    @Override
    public void pressStop(Hifi hifi) {
        System.out.println("Nothing happened!");
        hifi.setState(hifi.getTurnedOff());
    }

    @Override
    public void pressNext(Hifi hifi) {
        System.out.println("Nothing happened!");
        hifi.setState(hifi.getTurnedOff());
    }
}