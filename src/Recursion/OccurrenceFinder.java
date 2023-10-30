import java.util.ArrayList;
import java.util.List;

public class OccurrencesFinder {

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

        // Find occurrences
        List<Integer> occurrences = findOccurrences(arr, key, 0);

        // Print occurrences
        for (int index : occurrences) {
            System.out.print(index + " ");
        }
    }

    public static List<Integer> findOccurrences(int[] arr, int key, int index) {
        List<Integer> result = new ArrayList<>();

        // Base case: reached the end of the array
        if (index == arr.length) {
            return result;
        }

        // Check if the current element is equal to the key
        if (arr[index] == key) {
            result.add(index);
        }

        // Recursive call with the next index
        result.addAll(findOccurrences(arr, key, index + 1));

        return result;
    }
}