/**
 * Created by mvieck on 12/29/16.
 */
public class Desktop extends Computer {

    boolean gamingDesktop;

    public Desktop(String brand, int modelNumber, int wattPower, boolean internet, boolean gamingDesktop) {
        super(brand, modelNumber, wattPower, internet);
        this.gamingDesktop = gamingDesktop;
    }

    public boolean isGamingDesktop() {
        return gamingDesktop;
    }

    public void setGamingDesktop(boolean gamingDesktop) {
        this.gamingDesktop = gamingDesktop;
    }

    @Override
    public void turnOn() {
        if (!isOn()) {
            setOn(true);
            System.out.println("Turning Desktop On");
        } else {
            System.out.println("Desktop Already On");
        }
    }

    @Override
    public void turnOff() {
        if (isOn()) {
            setOn(false);
            System.out.println("Shutting Desktop Down");
        } else {
            System.out.println("Desktop Already Off");
        }
    }

    @Override
    public void restart() {
        System.out.println("Restarting The Desktop");
        turnOn();
        turnOff();
    }

    public void runGame(String game) {
        if (gamingDesktop) {
            System.out.printf("Starting up your game: %s\n",game);
        } else {
            System.out.printf("Your desktop isn't powerful enough to run %s\n", game);
        }
    }

    @Override
    public void printSpecs() {
        super.printSpecs();
        System.out.printf("Gaming Desktop: %b\n", isGamingDesktop());
        System.out.println();
    }
}
