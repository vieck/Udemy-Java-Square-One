/**
 * Created by mvieck on 12/29/16.
 */
abstract class Computer {
    private String brand;
    private int modelNumber;
    private int wattPower;
    private boolean on;
    private boolean internet;

    public Computer() {
        this.on = false;
        this.internet = false;
    }

    public Computer(String brand, int modelNumber, int wattPower, boolean internet) {
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.wattPower = wattPower;
        this.on = false;
        this.internet = internet;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWattPower() {
        return wattPower;
    }

    public void setWattPower(int wattPower) {
        this.wattPower = wattPower;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean hasInternetConnection() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public void moveMouse() {
        System.out.println("Mouse input received");
    }

    public void typeKeyboard() {
        System.out.println("Keyboard input received");
    }

    abstract void turnOn();
    abstract void turnOff();
    abstract void restart();
    public void printSpecs() {
        System.out.printf("Specifications\n" +
                "----------------------------\n" +
                "Brand: %s\n" +
                "Model Number: %d\n" +
                "Watts: %d\n" +
                "Internet: %b\n",
                getBrand(), getModelNumber(), getWattPower(), hasInternetConnection());
    }

}
