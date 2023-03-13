import java.util.Scanner;

public class theplank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] dpWays = new int[n+1];
        dpWays[0] = 1;
        for (int i = 0; i <= n; i++) {
            if (i >= 1)
                dpWays[i] += dpWays[i-1];
            if (i >= 2)
                dpWays[i] += dpWays[i-2];
            if (i >= 3)
                dpWays[i] += dpWays[i-3];
        }

        System.out.println(dpWays[n]);
    }
}
