import java.util.Scanner;

/**
 * Created by mvieck on 12/27/16.
 */
public class Palindrome {
    public static boolean checkPalindromeForLoop(String word) {
        /*Check every character starting with the first and last one
         then go until the middle of the string */
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindromeWhileLoop(String word) {
        int i = 0;
        int j = word.length() - 1;
        // If i is greater than j then we have checked the whole word
        while (i > j) {
            if (word.charAt(++i) != word.charAt(--j)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindromeRecursive(String word) {
        if (word.length() <= 1) {
            /* Base case
             The word is empty so it's a palindrome by default or the method is done */
            return true;
        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            // Removes first and last character of a string and calls method again
            return checkPalindromeRecursive(word.substring(1, word.length()-1));
        } else {
            //If the two conditions above aren't met the characters don't match
            return false;
        }
    }

    public static void main(String[] args) {
        String racecar = "racecar";
        String school = "school";
        String level = "level";

        System.out.printf("%s=%b, %s=%b, %s=%b",racecar,checkPalindromeForLoop(racecar), school, checkPalindromeWhileLoop(school), level, checkPalindromeRecursive(level));
    }
}
