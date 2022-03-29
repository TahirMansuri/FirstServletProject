import java.util.regex.Pattern;

public class ValidUserInformation {
    public static boolean isValidUsername(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(firstName).matches()) {
            return true;
        }
        return false;
    }

    public static boolean isValidPassword(String password) {
        String regex = "^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(password).matches()) {
            return true;
        }
        return false;
    }

}
