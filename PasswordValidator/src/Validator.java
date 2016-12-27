import java.util.Scanner;

/**
 * Created by mvieck on 12/26/16.
 */
public class Validator {

    public Validator(){

    }

    private void validate(String password) {
        boolean uppercase = hasUpperCase(password);
        boolean lowercase = hasLowerCase(password);
        boolean numbers = hasNumbers(password);
        boolean special = hasSpecialCharacter(password);
        boolean spaces = hasBlankSpaces(password);
        if (uppercase && lowercase && numbers && special && !spaces) {
            System.out.println("Password valid!");
        } else {
            System.out.println("Password not valid.");
        }
    }

    private boolean hasUpperCase(String password) {
        return Character.isUpperCase(password.charAt(0));
    }

    private boolean hasLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean hasNumbers(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean hasSpecialCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isAlphabetic(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean hasBlankSpaces(String password) {
        return password.contains(" ");
    }

    public static void main(String[] args) {
        System.out.printf("Enter in your password that starts with an uppercase letter & contains one lowercase, one number, one special character, and no blankspaces\n");
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();
        validator.validate(scanner.nextLine());
    }
}