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

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("Enter in two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(calculator.add(x,y));
        System.out.println(calculator.subtract(x,y));
        System.out.println(calculator.divide(x,y));
        System.out.println(calculator.multiply(x, y));
    }
}
