import java.util.Scanner;

/**
 * Created by mvieck on 12/22/16.
 */
public class Calculator {
    public Calculator() {

    }

    public int add(int x, int y) {
        System.out.printf("Adding %d & %d\n", x, y);
        return x + y;
    }

    public int subtract(int x, int y) {
        System.out.printf("Subtracting %d & %d\n", x, y);
        return x - y;
    }

    public int divide(int x, int y) {
        System.out.printf("Dividing %d & %d\n", x, y);
        return x / y;
    }

    public int multiply(int x, int y) {
        System.out.printf("Multiplying %d & %d\n", x, y);
        return x * y;
    }

    public void scanIntegers() {
        System.out.print("Enter in two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        calculate(x,y);
    }

    public void calculate(int x, int y) {
        System.out.println(add(x,y));
        System.out.println(subtract(x,y));
        System.out.println(divide(x,y));
        System.out.println(multiply(x, y));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.scanIntegers();
    }
}
