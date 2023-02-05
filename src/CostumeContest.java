import java.util.*;

public class CostumeContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfColleagues = input.nextInt();

        HashMap<String, Integer> costumes = new HashMap<>();
        String current;

        for (int i = 0; i < numOfColleagues; i++) {
            current = input.next();
            costumes.computeIfPresent(current, (key, value) -> value + 1);
            costumes.putIfAbsent(current, 1);
        }

        int minValue = findMin(costumes.values());

        ArrayList<String> bestCategories = new ArrayList<>();

        for (String key : costumes.keySet()) {
            if (costumes.get(key) == minValue) {
                bestCategories.add(key);
            }
        }

        Collections.sort(bestCategories);

        for (String element : bestCategories) {
            System.out.println(element);
        }
    }

    static int findMin(Collection<Integer> values) {
        int minValue = 10000;
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

}
