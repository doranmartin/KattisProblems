import java.util.Scanner;

public class digitswap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = new StringBuilder(scanner.next()).reverse().toString();
        System.out.println(output);
    }
}
