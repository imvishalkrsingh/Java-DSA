package Arrays.singleDimensional;
import java.util.*;
public class BinarySearch {

    public static int binarySearch(int number[], int key){
        int start = 0, end = number.length-1;

        while (start <= end){
            int mid = (start + end) / 2;

            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int numbers[] = {1,2,3,6,4,5};
//        int key = 6;
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter " + size + " elements of Array : ");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the value of key : ");
        int key = sc.nextInt();

        System.out.println(binarySearch(numbers, key));
    }
}
