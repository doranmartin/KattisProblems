import java.util.ArrayList;
import java.util.Scanner;

public class oddecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayList<String> echoes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            echoes.add(scanner.next());
        }

        for (int j = 0; j < echoes.size(); j += 2) {
            System.out.println(echoes.get(j));
        }
    }
}
