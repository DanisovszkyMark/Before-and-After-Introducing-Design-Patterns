package hifi;

/**
 * Hifi osztály a zene lejátszására.
 *
 * @author danisovszky.mark
 */
public class Hifi {

    /**
     * Állapotok kiemelése.
     */
    private HifiState turnedOff;
    private HifiState turnedOn;
    private HifiState playingMusic;

    private HifiState actualState;

    public HifiState getTurnedOff() {
        return turnedOff;
    }

    public HifiState getTurnedOn() {
        return turnedOn;
    }

    public HifiState getPlayingMusic() {
        return playingMusic;
    }

    /**
     * Dependency injection.
     */
    public void setState(HifiState hifiState) {
        this.actualState = hifiState;
    }

    public void pressPlay() {
        this.actualState.pressPlay(this);
    }

    public void pressStop() {
        this.actualState.pressStop(this);
    }

    public void pressNext() {
        this.actualState.pressNext(this);
    }

    /**
     * Állapotok létrehozása és kezdőállapot beállítása.
     */
    public Hifi() {
        this.turnedOff = new TurnedOff();
        this.turnedOn = new TurnedOn();
        this.playingMusic = new PlayingMusic();

        this.actualState = this.turnedOff;
    }
}