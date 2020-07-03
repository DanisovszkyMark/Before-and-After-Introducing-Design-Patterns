package hifi;

/**
 * Bekapcsolt (1) állapot megvalósítása.
 *
 * @author danisovszky.mark
 */
public class TurnedOn extends HifiState {

    @Override
    public void pressPlay(Hifi hifi) {
        System.out.println("Playing music!");
        hifi.setState(hifi.getPlayingMusic());
    }

    @Override
    public void pressStop(Hifi hifi) {
        System.out.println("Turned off!");
        hifi.setState(hifi.getTurnedOff());
    }

    @Override
    public void pressNext(Hifi hifi) {
        System.out.println("Next song.");
        hifi.setState(hifi.getTurnedOn());
    }
}