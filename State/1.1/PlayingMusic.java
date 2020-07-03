package hifi;

/**
 * A zenelejátszási (2) állapot megvalósítása.
 *
 * @author danisovszky.mark
 */
public class PlayingMusic extends HifiState {

    @Override
    public void pressPlay(Hifi hifi) {
        System.out.println("Music stopped.");
        hifi.setState(hifi.getTurnedOn());
    }

    @Override
    public void pressStop(Hifi hifi) {
        System.out.println("Music stopped.");
        hifi.setState(hifi.getTurnedOn());
    }

    @Override
    public void pressNext(Hifi hifi) {
        System.out.println("Change song.");
        hifi.setState(hifi.getPlayingMusic());
    }
}