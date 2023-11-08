package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class PrintReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an Arraylist : ");
        int size = sc.nextInt();

        ArrayList <Integer> array1 = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++){
            int element = sc.nextInt();
            array1.add(element);
        }

        System.out.println("Elements of an Array : ");
        System.out.println(array1);

        // Print Reverse of an Array List
        System.out.println("Reverse of Array List : ");
        for (int i = array1.size()-1 ; i >= 0; i--){
            System.out.print(array1.get(i) + " ");
        }
    }
}
