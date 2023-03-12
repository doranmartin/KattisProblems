import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d Abracadabra\n", i);
        }
    }
}
