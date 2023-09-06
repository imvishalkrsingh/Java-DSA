package Loops.ForLoop;
import java.util.Scanner;
public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
}
