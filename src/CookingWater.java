import java.util.Scanner;

public class CookingWater {
    public static void main(String[] args) {
        String result = runExperiment();
        System.out.println(result);
    }

    static String runExperiment() {
        Scanner input = new Scanner(System.in);
        int numOfTimes = input.nextInt();
        double lowerBound, upperBound, currentLower, currentUpper;
        lowerBound = input.nextDouble();
        upperBound = input.nextDouble();
        for (int i = 0, n = numOfTimes - 1; i < n; i++) {
            currentLower = input.nextDouble();
            currentUpper = input.nextDouble();
            if (currentLower > upperBound || currentUpper < lowerBound) {
                return "edward is right";
            }
            else if (currentLower > lowerBound) {
                lowerBound = currentLower;
            }
            else if (currentUpper < upperBound) {
                upperBound = currentUpper;
            }
        }
        return "gunilla has a point";
    }

}
