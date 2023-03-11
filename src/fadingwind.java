import java.util.Scanner;

public class fadingwind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int kRiseFactor = scanner.nextInt();
        int velocity = scanner.nextInt();
        int strengthOfWind = scanner.nextInt();
        long distance = 0;

        while (height > 0) {
            velocity += strengthOfWind;
            velocity -= Math.max(1, velocity / 10);

            if (velocity >= kRiseFactor) {
                height++;
            }
            else if (velocity > 0) {
                height--;
                if (height == 0) {
                    velocity = 0;
                }
            }
            else {
                height = velocity = 0;
            }

            distance += velocity;

            if (strengthOfWind > 0) {
                strengthOfWind--;
            }
        }

        System.out.println(distance);
    }
}
