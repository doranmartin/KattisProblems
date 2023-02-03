import java.util.Scanner;

public class Deathstar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] selfDestructCode = new int[n];
        int currentNum;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                currentNum = input.nextInt();
                selfDestructCode[i] |= currentNum;
                selfDestructCode[j] |= currentNum;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(selfDestructCode[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
    }
}
