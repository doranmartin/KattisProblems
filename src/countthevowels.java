import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countthevowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matcher m = Pattern.compile("[aeiouAEIOU]").matcher(scanner.nextLine());
        int count = 0;

        while (m.find()) {
            count++;
        }

        System.out.println(count);
    }
}
