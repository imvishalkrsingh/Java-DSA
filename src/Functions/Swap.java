package Functions;

public class Swap {

    static void Swap(int a, int b){
        int temp = a;
         a = b;
         b = temp;

        System.out.println("Values after Swap");
        System.out.println("A : " + a);
        System.out.println("B : " + b);
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        System.out.println("A : " + a);
        System.out.println("B : " + b);

        Swap(a, b);
    }
}
