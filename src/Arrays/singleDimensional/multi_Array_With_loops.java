package Arrays.singleDimensional;

public class multi_Array_With_loops {
    public static void main(String[] args) {

        int[][] arr_1 = { {10,11,12},{13,14,15},{16,17,18} };
        System.out.println("Length of arr_1 : " + arr_1.length);


        System.out.println("Values of arr_1 using for Loop : ");
        for (int i=0; i<arr_1.length; i++){
            for (int j=0; j<arr_1[i].length; j++){
                System.out.print(arr_1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Values of arr_1 using forEach Loop : ");
            for (int[] row : arr_1){
                for (int element : row){
                    System.out.print(element + " ");
                }
                System.out.println();
            }
    }
}
