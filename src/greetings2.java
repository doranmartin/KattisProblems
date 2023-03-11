import java.util.Scanner;

public class greetings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        input = input.substring(1, input.length() - 1);

        System.out.println("h" + input.concat(input) + "y");
    }
}
