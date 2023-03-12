import java.util.Scanner;

public class betting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(100.0 / a);
        System.out.println(100.0 / (100 - a));
    }
}
