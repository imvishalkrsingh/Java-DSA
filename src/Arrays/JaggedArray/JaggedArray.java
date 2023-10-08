package Arrays.JaggedArray;

public class JaggedArray {

        public static void main(String[] args){
            int[][] Array = new int[2][];
            Array[0] = new int[3];
            Array[1] = new int[4];
            int counter = 0;
            for(int row=0; row <Array.length; row++){
                for(int col=0; col < Array[row].length; col++){
                    Array[row][col] = counter++;
                }
            }
            for(int row=0; row < Array.length; row++){
                System.out.println();
                for(int col=0; col < Array[row].length; col++){
                    System.out.print(Array[row][col] + " ");
                }
            }
        }
    }

