/**
 * Created by mvieck on 12/21/16.
 */
public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        int x = 10;
        int y = 2;

        System.out.println("Arithmetic Operators");

        System.out.printf("Addition %d, ", x + y);
        System.out.printf("Subtraction %d, ", x - y);
        System.out.printf("Multiplication %d, ", x * y);
        //NOTE: Integer division will round up, Use a float or double for decimals
        System.out.printf("Division %d\n", x / y);

        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        System.out.println("\nRelational Operators");

        //Relational Operators
        System.out.println("Equal to %b " + (x == y));
        System.out.println("Not equal to %b " + (x != y));
        System.out.println("Greater than %b " + (x > y));
        System.out.println("Less than %b " + (x < y));
        System.out.println("Greater than or equal %b " + (x >= y));
        System.out.println("Less than or equal %b " + (x <= y));

        //Logical Operators
        System.out.println("\nLogic Operators");
        boolean a = true;
        boolean b = false;
        System.out.println("AND " + (a&&b));
        System.out.println("OR " + (a||b));
        System.out.println("Not " + !(a&&b));

        //Assignment Operators
        System.out.println("\nAssingment Operators");
        int z = 0;
        System.out.printf("Add %d\n", z+=x);
        System.out.printf("Subtract %d\n", z-=y);
        System.out.printf("Multiply %d\n", z*=y);
        System.out.printf("Divide %d\n", z/=y);
        System.out.printf("Modulus %d\n", z%=y);

        //Special Operator
        System.out.printf("\n%s", ((x == x) ? "yes": "no"));
        System.out.printf("\n%s", ((x == y) ? "yes": "no"));

    }
}
