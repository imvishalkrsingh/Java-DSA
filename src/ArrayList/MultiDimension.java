package ArrayList;
import java.util.*;

public class MultiDimension {

    public static void main(String[] args) {
        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Create and populate the first inner ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(10);
        mainList.add(list1);

        // Create and populate the second inner ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(6);
        list2.add(9);
        list2.add(12);
        list2.add(15);
        mainList.add(list2);

        // Create and populate the third inner ArrayList
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(8);
        list3.add(12);
        list3.add(16);
        list3.add(20);
        mainList.add(list3);

        // Display the elements of the 2D ArrayList
        System.out.println("Elements of the 2D ArrayList:");
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        // Display the 2D ArrayList
        System.out.println("2D ArrayList:");
        System.out.println(mainList);
    }
}
