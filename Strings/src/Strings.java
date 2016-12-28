import java.util.Scanner;

/**
 * Created by mvieck on 12/28/16.
 */
public class Strings {

    public static void main(String[] args) {
        Strings strings = new Strings();
        //System.in points to the console and scanner grabs input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter in your String: ");
        //Grab the entire line entered into the console
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);

        //String.length() will give the size of the string
        int length = input.length();
        //String Builder is the best way to construct a String but you can also do String += "some character or word";
        StringBuilder builder = new StringBuilder();
        for (int i = length-1; i >= 0; i--) {
            //Append one character at a time starting from the end
            builder.append(input.charAt(i));
        }
        System.out.printf("Reversed %s into %s\n",input, builder.toString());
    }
}
