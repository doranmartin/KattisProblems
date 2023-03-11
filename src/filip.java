import java.util.Scanner;

public class filip {
    public static void main(String[] args) {
        /*
        Filip has a horrible teacher and this lesson will confuse him even more
         */
        Scanner scanner = new Scanner(System.in);
        int firstNumReversed = Integer.parseInt(new StringBuilder(scanner.next()).reverse().toString());
        int secondNumReversed = Integer.parseInt(new StringBuilder(scanner.next()).reverse().toString());

        if (firstNumReversed > secondNumReversed)
            System.out.println(firstNumReversed);
        else
            System.out.println(secondNumReversed);
    }
}
