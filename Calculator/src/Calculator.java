import java.util.Scanner;

/**
 * Created by mvieck on 12/22/16.
 */
public class Calculator implements Functions{
    public Calculator() {

    }

    public double add(double x, double y) {
        System.out.printf("Adding %d & %d\n", x, y);
        return x + y;
    }

    public double subtract(double x, double y) {
        System.out.printf("Subtracting %d & %d\n", x, y);
        return x - y;
    }

    public double divide(double x, double y) {
        System.out.printf("Dividing %d & %d\n", x, y);
        return x / y;
    }

    @Override
    public double power(double number, double power) {
        System.out.printf("Raising %d to %d\n", number, power);
        return Math.pow(number, power);
    }

    @Override
    public double absValue(double x) {
        System.out.printf("Absolute Value of %d\n", x);
        return Math.abs(x);
    }

    public double multiply(double x, double y) {
        System.out.printf("Multiplying %d & %d\n", x, y);
        return x * y;
    }

    public void scanIntegers() {
        System.out.print("Enter in two numbers: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        calculate(x,y);
    }

    public void calculate(double x, double y) {
        System.out.println(add(x,y));
        System.out.println(subtract(x,y));
        System.out.println(divide(x,y));
        System.out.println(multiply(x, y));
        System.out.println(absValue(x) + " " + absValue(y));
        System.out.println(power(x,y));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.scanIntegers();
    }
}
