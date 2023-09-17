package Oops.ClassAndObjects;
public class passByValue {

    public static void decrease(int n1, int n2){
        n1--;
        n2 = n2-2;
        System.out.print("Value of Formal parameters");
        System.out.println(n1 + " : " + n2);
        // n1 and n2 are formal parameters
    }
    public static void main(String[] args) {

        int p = 26;
        int q = 13;

        decrease(p,q);
        System.out.print("Value of Actual parameters");
        System.out.println(p + " : " + q);

    }
}
