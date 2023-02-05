import java.util.Scanner;
public class Exam {

    private static int numOfQuestions;

    public static void main(String[] args) {

        // Get input
        Scanner input = new Scanner(System.in);
        int friendScore = input.nextInt();
        String myAnswers = input.next();
        String friendAnswers = input.next();
        numOfQuestions = myAnswers.length();

        // Calculate num of matches
        int numOfMatches = getMatches(myAnswers, friendAnswers);

        // Find max score possible
        int maxScorePoss;
        if (numOfMatches > friendScore) {
            maxScorePoss = numOfQuestions - (numOfMatches - friendScore);
        }
        else if (numOfMatches == friendScore) {
            maxScorePoss = numOfQuestions;
        }
        else {
            maxScorePoss = numOfMatches + (numOfQuestions - friendScore);
        }

        // Print output
        System.out.println(maxScorePoss);
    }

    private static int getMatches(String myAnswers, String friendAnswers) {
        int numOfMatches = 0;
        for (int i = 0; i < numOfQuestions; i++) {
            if (myAnswers.charAt(i) == friendAnswers.charAt(i)) {
                numOfMatches++;
            }
        }
        return numOfMatches;
    }

}
