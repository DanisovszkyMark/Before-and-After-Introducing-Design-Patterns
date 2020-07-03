import hifi.Hifi;

public class Main {
    public static void main(String[] args){
        Hifi hifi = new Hifi();

        hifi.buttonPressed(0);
        hifi.buttonPressed(0);
        hifi.buttonPressed(2);
        hifi.buttonPressed(1);
        hifi.buttonPressed(1);
    }
}
