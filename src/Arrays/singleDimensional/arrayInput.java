package Arrays.singleDimensional;

import java.util.Scanner;
public class arrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();
        int [] arr= new int[size];

        System.out.println("Enter array elements : ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = Integer.parseInt(sc.next());
        }


        System.out.println("Elements of array : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

}
