package Arrays.singleDimensional;

public class maxOfArray {
    public static void main(String[] args) {
        int[] number = {2,3,4,9,7,8,1,0};
        int max = 0;

        for (int i = 0; i < number.length; i++){
            if(number[i] > max){
                max = number[i];
            }
        }

        System.out.println("Maximum Number in this array : " + max);
    }
}
