package Bit_Manipulation;
import java.util.Scanner;
public class ith_Bit {

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
            return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIthBit(n,i);
        }else {
            return setIthBit(n, i);
        }
    }

    public static int clearLastIthBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        System.out.print("Enter value of i : ");
        int i = sc.nextInt();

        System.out.print("Enter New Bit : ");
        int newBit = sc.nextInt();

        System.out.print("Get ith Bit : ");
        System.out.println(getIthBit(number, i));

        System.out.print("Set ith Bit : ");
        System.out.println(setIthBit(number, i));

        System.out.print("Clear ith Bit : ");
        System.out.println(clearIthBit(number, i));

        System.out.print("update ith Bit : ");
        System.out.println(updateIthBit(number, i, newBit));

        System.out.print("Clear last ith Bit : ");
        System.out.println(clearLastIthBits(number, i));

        System.out.print("Clear Bits in Range : ");
        System.out.println(clearBitsInRange(10,2,4));
    }
}
