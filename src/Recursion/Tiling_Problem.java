package Recursion;
import java.util.Scanner;
public class Tiling_Problem {

    public static int tilingProblem(int n){
        // 2 * n  (floor size)

        if(n == 0 || n == 1){
            return 1;
        }

        // Vertical choice
        int fnm1 = tilingProblem(n-1);

        // Horizontal Choice
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N : ");
        int n = sc.nextInt();

        System.out.print("Total size required : ");
        System.out.println(tilingProblem(n));

    }
}
