/**
 * Created by mvieck on 12/29/16.
 */
public class Laptop extends Computer {

    private boolean wifi;
    private boolean webcam;
    private boolean webcamOn;

    public Laptop(String brand, int modelNumber, int wattPower, boolean internet, boolean wifi, boolean webcam) {
        super(brand, modelNumber, wattPower, internet);
        this.wifi = wifi;
        this.webcam = webcam;
        this.webcamOn = false;
    }

    public boolean hasWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean hasWebcam() {
        return webcam;
    }

    public void setWebcam(boolean webcam) {
        this.webcam = webcam;
    }

    public boolean isWebcamOn() {
        return webcamOn;
    }

    public void setWebcamOn(boolean webcamOn) {
        this.webcamOn = webcamOn;
    }

    @Override
    void turnOn() {
        if (!isOn()) {
            setOn(true);
            System.out.println("Turning Laptop On");
        } else {
            System.out.println("Laptop Already On");
        }
    }

    @Override
    void turnOff() {
        if (isOn()) {
            setOn(false);
            System.out.println("Shutting Laptop Down");
        } else {
            System.out.println("Laptop Already Off");
        }
    }

    @Override
    void restart() {
        turnOff();
        turnOn();
    }

    void turnOnWebcam() {
        if (hasWebcam()) {
            if (!isWebcamOn()) {
                setWebcamOn(true);
                System.out.println("Turning Webcam On");
            } else {
                System.out.println("Webcam Already On");
            }
        } else {
            System.out.println("No webcam available");
        }
    }

    void turnOffWebcam() {
        if (hasWebcam()) {
            if (isWebcamOn()) {
                setWebcamOn(false);
                System.out.println("Turning Webcam Off");
            } else {
                System.out.println("Webcam Already Off");
            }
        } else {
            System.out.println("No webcam available");
        }
    }

    @Override
    public void printSpecs() {
        super.printSpecs();
        System.out.printf("Wifi: %b\n" +
                        "Webcam: %b\n",
                 hasWifi(), hasWebcam());
        System.out.println();
    }
}


