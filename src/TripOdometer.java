import java.util.Scanner;
import java.util.TreeSet;

public class TripOdometer {
    public static void main(String[] args) {

        // Take in input
        Scanner scanner = new Scanner(System.in);
        int trips = scanner.nextInt();
        TreeSet<Integer> distances = new TreeSet<>();
        for (int i = 0; i < trips; i++) {
            distances.add(scanner.nextInt());
        }

        // Calculate possibilities
        int numOfPossibilities = distances.size();

        // Output data

    }
}
