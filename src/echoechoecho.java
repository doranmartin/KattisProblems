import java.util.Scanner;

public class echoechoecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        StringBuilder echo = new StringBuilder(word);

        for (int i = 0; i < 2; i++) {
            echo.append(" " + word);
        }

        System.out.println(echo.toString());
    }
}
