import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by mvieck on 12/28/16.
 */
public class ArrayIntro {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        // intArray[3] = 3; Will give an array out of bounds exception since we start at position 0
        intArray = new int[]{1, 0, 3};

        double[] doubleArray = new double[]{0.0,1.1,2.2};
        String[] stringArray = new String[]{"One","Two","Three"};
        //Use Arrays class to convert and manipulate arrays
        //The length variable inside arrays give the sie of an array
        System.out.printf("Array %s with size %d\n",Arrays.toString(doubleArray), doubleArray.length);
        System.out.printf("Before sorting %s\n",Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.printf("After sorting %s\n",Arrays.toString(intArray));

        //Data types will not work, must use objects and relative types
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        dynamicArray.add(1);
        dynamicArray.add(0);
        dynamicArray.add(2);
        System.out.printf("Before Sorting %s\n",dynamicArray.toString());
        //Arraylists are objects and have builtin methods for sorting
        dynamicArray.sort(Comparator.naturalOrder());
        System.out.printf("After Sorting %s\n",dynamicArray.toString());
    }
}
