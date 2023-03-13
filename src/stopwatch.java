import java.util.Scanner;

public class stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if ((N & 1) == 1) {
            System.out.println("still running");
            System.exit(0);
        }

        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = scanner.nextInt();
        }

        int total = 0;
        for (int j = 1; j < times.length; j += 2) {
            total += times[j] - times[j-1];
        }

        System.out.println(total);
    }
}
