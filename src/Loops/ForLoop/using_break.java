package Loops.ForLoop;

public class using_break {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++){
            if(i % 5 == 0){
                break;
            }
            System.out.println(i);
        }
    }
}
