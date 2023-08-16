package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String regex = "abc";
        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern);
    }
}
