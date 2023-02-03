import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int result;
        if (x > 0) {
            result = (y > 0) ? 1 : 4;
        }
        else {
            result = (y > 0) ? 2 : 3;
        }
        System.out.println(result);
    }
}
