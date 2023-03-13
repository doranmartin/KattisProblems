import java.util.Scanner;

public class magictrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int canGuess = 1;
        int[] letters = new int[26];
        int hash;
        for (int i = 0; i < s.length(); i++) {
            hash = s.charAt(i) % 26;
            if (letters[hash] == 1) {
                canGuess = 0;
                break;
            }
            letters[hash] = 1;
        }

        System.out.println(canGuess);
    }
}
