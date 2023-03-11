import java.util.Scanner;

public class findingana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(input.substring(input.indexOf('a')));
    }
}
