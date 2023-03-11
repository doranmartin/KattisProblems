import java.util.Scanner;

public class JumboJavelin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfRods = scanner.nextInt();
        int numOfFuses = numOfRods - 1;
        int javelinLength = 0;

        for (int i = 0; i < numOfRods; i++) {
            javelinLength += scanner.nextInt();
        }
        javelinLength -= numOfFuses;
        System.out.println(javelinLength);
    }
}
