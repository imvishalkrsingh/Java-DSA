package Arrays.singleDimensional;
import java.util.Scanner;
public class FrequencyArray {


    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];

        for (int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " Elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        int[] freq = makeFrequencyArray(array);

        System.out.print("Enter Number of Queries : ");
        int queries = sc.nextInt();


        while (queries > 0){
            System.out.print("Enter number to be Searched : ");
            int x = sc.nextInt();

            if(freq[x] > 0){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            queries--;
        }
    }
}
