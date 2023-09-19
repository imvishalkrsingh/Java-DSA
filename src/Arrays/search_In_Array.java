package Arrays;

import java.util.Scanner;

public class search_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = {2, 3, 4, 9, 7, 8, 1, 0};

        System.out.print("Array is : ");
        for (int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.print("Enter number which you want to search from the array List : ");
        int search = sc.nextInt();
        int ans = -1;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == search) {
                ans = i;
            }
        }
        if(ans == -1 ){
            System.out.println("Not found");
        }
        else{
            System.out.println( "Found " + search + " at index "  + ans );
        }
    }
}