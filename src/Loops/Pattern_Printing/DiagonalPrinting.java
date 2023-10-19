package Loops.Pattern_Printing;

public class DiagonalPrinting {
    public static void main(String[] args) {
        int row = 4;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < row; j++){
                if(i + j == 4-1 || i == j){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
