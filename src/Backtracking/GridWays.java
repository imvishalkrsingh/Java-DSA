package Backtracking;
import java.util.Scanner;
public class GridWays {

    public static int gridWays(int i, int j, int n, int m){
        if(i == n-1 || j == m-1){
            return 1;
        } else{
            if(i == n || j == n){
                return 0;
            }
        }

        int w1 = gridWays(i+1, j, n,m);
        int w2 = gridWays(i, j+1,n,m);
        return w1+w2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Rows : ");
        int i = sc.nextInt();

        System.out.print("Enter Value of column : ");
        int j = sc.nextInt();

        System.out.print("Enter Number of Rows : ");
        int n = sc.nextInt();

        System.out.print("Enter Number of Columns : ");
        int m = sc.nextInt();

        System.out.print("Total Number of Ways : ");
        System.out.println(gridWays(i,j,n,m));
    }
}
