/**
 * Created by mvieck on 12/28/16.
 */
public class Loops {
    public static void main(String[] args) {
        boolean comparison = (3 > 2);
        if (comparison) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //0 is our minimum and we cast to an int since Math.random is a double
        int randomInt = 0 + (int) (Math.random() * 5);
        switch (randomInt) {
            case 0:
                System.out.println("Zero given");
                break;
            case 1:
                System.out.println("One given");
                break;
            case 2:
                System.out.println("Two given");
                break;
            default:
                System.out.printf("Some other number given: %d\n", randomInt);
        }

        int intArray[] = {0, 1, 2, 3};
        System.out.println("For Loops");
        //always int, comparision, then incrementer/decrementer
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%d ", intArray[i]);
            if (i == intArray.length - 1) {
                System.out.println();
            }
        }
        //For loop with more than one int has to be seperated by a comma
        for (int i = 0, j = intArray.length - 1; i < intArray.length && j >= 0; i++, j--) {
            System.out.printf("{%d,%d} ", intArray[i], intArray[j]);
            if (i == intArray.length - 1) {
                System.out.println();
            }
        }

        System.out.println("For Each");
        //To create a for each loop, just make a variable, seperate it with a colon, then put the array
        for (int integer : intArray) {
            System.out.printf("%d ", integer);
        }
        System.out.println();
        String[] strArray = new String[]{"First","Second","Third"};
        for (String str : strArray) {
            System.out.printf("%s ", str);
        }
        System.out.println();

        System.out.println("While Loop");
        int i = 0;
        while (i < intArray.length) {
            System.out.printf("%d ", intArray[i]);
            i++;
            if (i==intArray.length) {
                System.out.println();
            }
        }

        System.out.println("Do While Loop");
        //Do while loops are normally used in a situation where
        //you need to do something before comparing or changing a variable
        i = 3;
        do {
            System.out.printf("%d ", i--);
            if (i == 0) {
                System.out.println();
            }
        } while (i > 0);
    }
}
