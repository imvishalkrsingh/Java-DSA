/*
Q. Difference between array and array list in simple words ?
ans :- Array:
Fixed size: You need to declare the size of the array when you create it, and it cannot be changed later.
Basic data structure: Elements are stored in contiguous memory locations.
Primitive type: Can hold only elements of the same data type.
ArrayList:
Dynamic size: You can add or remove elements easily, and the size adjusts automatically.
Built on top of arrays: Internally uses an array but provides more functionality.
Collection class: Part of Java Collections Framework, offering more methods and flexibility.
So, arrays are like fixed-size boxes of a single type, while ArrayLists are like magic boxes that can change size and hold different types of items.
 */

package Arrays.Arraylist;
import java.util.ArrayList;
public class ArrayListIntro {

    public static void main(String[] args) {


        ArrayList<Integer> l1 = new ArrayList<>();

//        ArrayList<Boolean> l2 = new ArrayList<>();

//        ArrayList<Float>  l3 = new ArrayList<>();

//        ArrayList<Character> l4 = new ArrayList<>();

//          ArrayList<Double> l5 = new ArrayList<>();

//       ................. add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

//        .................get an element at index i
//        System.out.println(l1.get(1));

//        .................print with for Loop
        System.out.println("print Array list using for loop");
        for (int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }

//        .................print Array list directly without loop
        System.out.println("Print array list directly without loop : ");
        System.out.println(l1);

//        ......adding element at some index i -- [ 5 100 6 7 8]
        System.out.println("Adding element at some index i : ");
        l1.add(1,100);
        System.out.println(l1);

//      ..........modifying element at index i
        System.out.println("Modifying element at index i :");
        l1.set(1, 10);
        System.out.println(l1);

//      ......... removing an element at index i
        System.out.println("Removing an element at index i :");
        l1.remove(1);
        System.out.println(l1);

//       ..............removing an element e
        System.out.println("Removing an element e : ");
//        l1.remove(Integer.valueOf(7));   // it remove 7 from array list
        System.out.println(l1.remove(Integer.valueOf(7)));   // it returns true value
        System.out.println(l1);

//        ...........checking if an element exists or not
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(l1);

//        if you don't specify class, you can put anything inside l
        System.out.println("Array list without specifying class : ");
        ArrayList l = new ArrayList();

        l.add("Vishal");
        l.add(17);
        l.add(true);
        System.out.println(l);

    }
}
