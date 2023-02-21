import java.util.Scanner;

public class CinemaCrowds2 {
    public static void main(String[] args) {
        // Take first line of input
        Scanner scanner = new Scanner(System.in);
        int numOfVisitors = scanner.nextInt();
        int numOfGroups = scanner.nextInt();

        // Take in second line of input and calculate
        for (int i = 0; i < numOfGroups; i++) {
            int groupVisitors = scanner.nextInt();
            if (numOfVisitors - groupVisitors >= 0) {
                numOfVisitors -= groupVisitors;
            }
            else {
                System.out.println(numOfGroups - i);
                break;
            }
        }
    }
}
