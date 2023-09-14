package Oops.Basics;

import java.util.Scanner;

class algebra{

    int add(int a, int b){
        int ans = a + b;
        return ans;
    }

}

public class methodWithClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        algebra object1 = new algebra();

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.print("Sum of integers is : ");
        int ans = object1.add(a,b);

        System.out.println(ans);
    }

}
