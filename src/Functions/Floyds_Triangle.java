package Functions;
import java.util.Scanner;
public class Floyds_Triangle {

    static void floydTriangle(int number){
        int counter = 1;
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        floydTriangle(rows);
    }
}
