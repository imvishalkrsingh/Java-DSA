package Arrays.singleDimensional;
import java.util.Scanner;
public class ArrayTarget {

        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int target = scn.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (target == arr[i]) {
                    System.out.println(i);
                    return;
                }
            }
            System.out.println(-1);
        }
    }


