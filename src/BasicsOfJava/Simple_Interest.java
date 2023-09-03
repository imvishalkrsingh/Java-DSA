package BasicsOfJava;

public class Simple_Interest {
    public static void main(String[] args) {
        double principle = 5000;
        double rate = 10.99;
        double time = 3;
        double simple_Interest = (principle * rate * time) / 100 ;
        System.out.println(simple_Interest);
    }
}
