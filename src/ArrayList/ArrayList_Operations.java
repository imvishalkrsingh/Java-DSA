package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Operations {

    public static void main(String[] args) {
        // Size of the ArrayList
        int n = 5;

        // Declaring and initializing ArrayList with initial size n
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        // Declaring an empty ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        // Printing the initial ArrayLists
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        // Appending new elements at the end of the list
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
            arr2.add(i);
        }

        // Printing the ArrayList after adding elements
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        // Adding a single element to arr1
        arr1.add(34);

        // Getting and printing an element from arr1
        System.out.println("Element at index 1 in Array 1: " + arr1.get(1));

        // Printing the entire arr1
        System.out.println("Array 1:" + arr1);

        // Removing an element from arr1
        arr1.remove(2);
        System.out.println("Array 1 after removing element at index 2: " + arr1);

        // Set element at a specific index
        arr1.set(3, 99);
        System.out.println("Array 1:" + arr1);

        // contains Element
        System.out.println("Check 4 exist or Not : " + arr1.contains(4));
        System.out.println("Check 4 exist or Not : " + arr1.contains(95));

        // check size of the Array list
        System.out.println("Size of an Array List : " + arr2.size());

        // print all the elements of an Array list through loop
        System.out.println("Print all the elements of an Array list : ");
        for (int i = 0; i < arr1.size(); i++){
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
    }
}
