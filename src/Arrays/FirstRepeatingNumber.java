package Arrays;
import java.util.Scanner;
public class FirstRepeatingNumber {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int size = sc.nextInt();

        int [] array = new int[size];

        System.out.println("Enter " + size + " Elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }


    }
}
