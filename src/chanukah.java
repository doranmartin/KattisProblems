import java.util.Scanner;

public class chanukah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int[] K = new int[P+1];
        for (int i = 1; i < K.length; i++) {
            scanner.next();
            K[i] = scanner.nextInt();
        }

        for (int j = 1; j < K.length; j++) {
            System.out.println(j + " " + (K[j] * (K[j] + 1) / 2 + K[j]));
        }
    }
}
