package Oops.ClassAndObjects;



class mathematical_calculation {

    // class level variable which can not be accessed outside the class
    int a = 5;
    int b = 10;

    int add(){
        System.out.print("Addition of a and b : ");
        return(a+b);
    }

    int subs(){
        System.out.print("Subtraction of a and b : ");
        return a-b;
    }

    int multi(){
        System.out.print("Multiplication of a and b : ");
        return a*b;
    }
}

public class scope {
    public static void main(String[] args) {
        mathematical_calculation object = new mathematical_calculation();
        System.out.println(object.add());
        System.out.println(object.subs());
        System.out.println(object.multi());

    }
}
