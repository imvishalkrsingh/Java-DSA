package ArrayList;
import java.util.*;
public class SortingArrayList {

    public static void main(String[] args) {

        // Create and initialize an ArrayList
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(2);
        array1.add(5);
        array1.add(9);
        array1.add(3);
        array1.add(6);

        System.out.println("Original Array List :");
        System.out.println(array1);

        // Sort in Ascending order
        System.out.println("Sorted in Ascending Order :");
        Collections.sort(array1);
        System.out.println(array1);


        // sort in Descending Order
        System.out.println("Sort in Descending Order : ");
        Collections.sort(array1, Collections.reverseOrder());
        System.out.println(array1);
    }
}
