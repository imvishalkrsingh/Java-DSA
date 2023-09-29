package Arrays.singleDimensional;

public class array_With_Loops {

    public static void main(String[] args) {

//        single dimensional arrays
        int[] ages = {10,12,23};

        System.out.println("Length of ages Array : " + ages.length);
        System.out.println("Traversing through the ages Array Using For Loop");
        for (int i =0; i < ages.length; i++){
            System.out.println(ages[i]);
        }

        System.out.println("Traversing through the ages Array Using ForEach Loop");
        for(int age : ages){
            System.out.println(age);
        }

        System.out.println("Traversing through the ages Array Using While Loop");
        int i = 0;
        while(i < ages.length){
            System.out.println(ages[i]);
            i++;
        }

        System.out.println();



//        multi-dimensional arrays
        int[][] arr_1 = { {10,11,12},{13,14,15},{16,17,18} };
        System.out.println("Length of arr_1 : " + arr_1.length);


    }
}
