package Arrays.Arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        System.out.println("Original List : ");
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println("Sorted in Ascending order : " + list1);


        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("Sorted in Descending order : " + list1);


        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("Chemistry");
        list2.add("Physics");
        list2.add("Math");
        list2.add("English");
        list2.add("Hindi");

        System.out.println("Original String List : ");
        System.out.println(list2);
        System.out.println();

        System.out.println("Sorted String List in Ascending order : ");
        Collections.sort(list2);
        System.out.println(list2);
        System.out.println();

        System.out.println("Sorted String List in Descending order : ");
        Collections.sort(list2,Collections.reverseOrder());
        System.out.println(list2);

    }
}
