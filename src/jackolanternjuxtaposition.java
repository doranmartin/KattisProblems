import java.util.Scanner;

public class jackolanternjuxtaposition {
    public static void main(String[] args) {
        /*
        We can use the rule of product counting technique
        to determine that the total number of possible combinations
        is eye designs * nose designs * mouth designs
         */
        Scanner scanner = new Scanner(System.in);
        int designCombinations = 1;

        for (int i = 0; i < 3; i++) {
            designCombinations *= scanner.nextInt();
        }

        System.out.println(designCombinations);
    }
}
