import java.util.Scanner;

public class grassseed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double C = scanner.nextDouble();
        int L = scanner.nextInt();
        double area = 0;
        for (int i = 0; i < L; i++) {
            area += scanner.nextDouble() * scanner.nextDouble();
        }

        System.out.println(C * area);
    }
}
