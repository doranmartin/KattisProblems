import java.util.Scanner;

public class fyi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().startsWith("555"))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
