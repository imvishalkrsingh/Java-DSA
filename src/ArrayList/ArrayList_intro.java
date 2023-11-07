package ArrayList;

// Java program to demonstrate the
// working of ArrayList
import java.util.ArrayList;
import java.util.Scanner;

class ArrayListExample {
    public static void main(String[] args)
    {
        // Size of the
        // ArrayList
        int n = 5;

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        // Declaring the ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        // Declaring another ArrayList
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Vishal");
        list1.add("Aman");
        list1.add("Chris");


        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
            arr2.add(i);
        }

        // Printing the ArrayList
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);
        System.out.println("List 1 :" + list1);


        // Get Operations
        System.out.println(list1.get(2));

        // Get all the elements of the Arraylist by using for Loop
        for (int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }

    }
}
