package BasicsOfJava;

public class swap2Numbers {

    static void swap(int a, int b){
        System.out.println("Values before Swap : ");
        System.out.println(" first : " + a);
        System.out.println(" second : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Values after");
        System.out.println("first : " + a);
        System.out.println("second : " + b);
    }

    public static void main(String[] args) {
        int first = 10;
        int second = 20;

    swap(first,second);
    }
}
