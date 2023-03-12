import java.util.Scanner;

public class cutthenegativity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCities = scanner.nextInt();
        StringBuilder output = new StringBuilder();
        int numOfDirectFlights = numOfCities * numOfCities;
        int value = 0;

        for (int i = 1; i <= numOfCities; i++) {
            for (int j = 1; j <= numOfCities; j++) {
                value = scanner.nextInt();
                if (value == -1)
                    numOfDirectFlights--;
                else
                    output.append(String.format("%d %d %d\n", i, j, value));
            }
        }

        System.out.println(numOfDirectFlights);
        System.out.println(output);
    }
}
