/**
 * Created by mvieck on 12/21/16.
 */
public class Basics {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "First";
        strArray[1] = "Second";
        strArray[2] = "Third";

        strArray = new String[]{"First", "Second", "Third"};
        System.out.printf("%s %s %s\n",strArray[0],strArray[1],strArray[2]);

        int[] intArray = new int[3];
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;

        //An expression is a construct made of variables, operators, and method calls that equals a single value
        int x = 0;
        int y = 1;
        int z = x+y;
        System.out.println("Expression value " + z);
        //A compound expression
        z = 1 * 2 * 3;

        //A Statement is a form of program execution, anything ending with a semicolon
        z = 10;
        z++;

        boolean compare = true;
        if (compare) { //Start Block 1
            System.out.println("Block 1");
        } // end Block 1
        else
        { // Start Block 2
            System.out.println("Block 2");
        } // End Block 2
    }
}
