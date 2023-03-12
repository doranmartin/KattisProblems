import java.util.Scanner;

public class cutthenegativity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCities = scanner.nextInt();
        int value;

        for (int i = 1; i <= numOfCities; i++) {
            for (int j = 1; j <= numOfCities; j++) {
                value = scanner.nextInt();
                if (value != -1)
                    System.out.printf("");
            }
        }
    }
}
