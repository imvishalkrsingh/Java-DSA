package Arrays.singleDimensional;
import java.util.Scanner;
public class LinearSearch {

    static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter " + size + " elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the original Array : ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Enter the value to search : ");
        int key = sc.nextInt();

        int result = linearSearch(array, key);

        System.out.println(key + " Found at : " + result);
    }
}
