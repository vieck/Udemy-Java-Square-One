import java.util.Scanner;

/**
 * Created by mvieck on 12/21/16.
 */
public class Car {

    String brand;
    int speed;
    int drive;

    public Car() {
        brand = "";
        speed = 0;
        drive = 0;
    }

    public static void main(String[] args) {

        Car car = new Car();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in a car brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter in the prefered speed: ");
        int speed = car.convertStringToInt(scanner.nextLine());
        System.out.print("Enter in the max drive: ");
        int drive = car.convertStringToInt(scanner.nextLine());

        car.setBrand(brand);
        car.setSpeed(speed);
        car.setDrive(drive);

        System.out.printf("Brand: %s, Speed: %d mph/kmh, Drive: %dth gear\n", car.getBrand(), car.getSpeed(), car.getDrive());
    }

    public int convertStringToInt(String speedStr) {
        int integer = Integer.parseInt(speedStr);
        return integer;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    public int getDrive() {
        return drive;
    }
}
