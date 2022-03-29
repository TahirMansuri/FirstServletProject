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
}
