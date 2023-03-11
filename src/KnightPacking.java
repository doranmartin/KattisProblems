import java.util.Scanner;
public class KnightPacking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // If N is odd, player 1 can force a win. If N is even, player 2 can force a win.
        int n = scanner.nextInt();
        if ((n & 1) == 0) {
            System.out.println("second");
        }
        else {
            System.out.println("first");
        }
    }
}
