import java.util.Scanner;

public class qaly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quality, quantity;
        double qaly = 0;

        for (int i = 0, n = scanner.nextInt(); i < n; i++) {
            quality = scanner.nextDouble();
            quantity = scanner.nextDouble();
            qaly += quality * quantity;
        }

        System.out.printf("%.3f\n", qaly);
    }
}
