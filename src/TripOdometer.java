import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class TripOdometer {
    public static void main(String[] args) {

        // Take in input
        Scanner scanner = new Scanner(System.in);
        int trips = scanner.nextInt();
        int[] distancesArray = new int[trips];
        for (int i = 0; i < trips; i++) {
            distancesArray[i] = scanner.nextInt();
        }

        // Calculate possibilities
        HashSet<Integer> distances = new HashSet<>();

        for (int i = 0; i < trips; i++) {
            int sum = 0;
            for (int j = 0; j < trips; j++) {
                if (j != i)
                    sum += distancesArray[j];
            }
            distances.add(sum);
        }
        Integer[] possibleTotals = distances.toArray(new Integer[0]);
        Arrays.sort(possibleTotals);

        // Output data
        System.out.println(distances.size());
        for (int k = 0, m = possibleTotals.length; k < m; k++) {
            System.out.print(possibleTotals[k]);
            if (k != m - 1)
                System.out.print(" ");
        }
    }
}
