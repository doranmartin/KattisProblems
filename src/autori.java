import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Matcher matcher = Pattern.compile("[A-Z]").matcher(input);
        String output = "";

        while(matcher.find()) {
            output = output.concat(matcher.group());
        }

        System.out.println(output);
    }
}
