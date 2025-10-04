import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hRegex {
    public static void main(String[] args) {
        String text = "I am iron man" ;
        Pattern pattern = Pattern.compile("iron man");
        Matcher matcher = pattern.matcher(text);
        System.out.print("Result of regex " + matcher.find());

    }
}
// Gom hai phuong thuc Patten - Matcher //
// matcher.find - matcher.com
//