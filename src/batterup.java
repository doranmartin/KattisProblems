import java.util.Scanner;

public class batterup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int atBats = n;
        double total = 0;
        int current;

        for (int i = 0; i < n; i++) {
            current = scanner.nextInt();
            if (current == -1) {
                atBats--;
                continue;
            }
            total += current;
        }

        System.out.println(total / atBats);
    }
}
