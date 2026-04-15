import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main() {
        String regexp = "^[A-Z a-z 0-9]{3,}$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher("1abAB2");
        if(matcher.matches())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
