package hifi;

/**
 * Közös felület az állapotokra.
 *
 * @author danisovszky.mark
 */
public abstract class HifiState {

    /**
     * Azok a metódusok kerültek kiemelésre, melyekben olyan redundáns if-et találtunk,
     * ahol az if törzse megváltoztatta valamilyen irányba a feltételben szereplő mezőt.
     */
    public abstract void pressPlay(Hifi hifi);
    public abstract void pressStop(Hifi hifi);
    public abstract void pressNext(Hifi hifi);
}
