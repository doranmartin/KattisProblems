import java.util.ArrayList;
import java.util.Scanner;

public class billiard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, s, m, n;
        double horizDist, vertDist, angle, speed;
        ArrayList<String> output = new ArrayList<>();
        while (scanner.hasNext()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            s = scanner.nextInt();
            m = scanner.nextInt();
            n = scanner.nextInt();

            if (
                    a == 0 && b == 0 && s == 0 &&
                    m == 0 && n == 0
            )
                break;

            horizDist = a * m;
            vertDist = b * n;
            angle = Math.atan(vertDist / horizDist) * 180 / Math.PI;
            speed = Math.sqrt(Math.pow(horizDist, 2) + Math.pow(vertDist, 2)) / s;
            output.add(String.format("%.2f %.2f", angle, speed));
        }

        for (String string: output) {
            System.out.println(string);
        }
    }
}
