import java.util.Scanner;

public class spavanac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M >= 45) {
            System.out.println(H + " " + (M - 45));
        }
        else {
            if (H == 0) {
                H = 23;
            } else {
                H--;
            }
            System.out.println(H + " " + (60 - (45 - M)));
        }
    }
}
