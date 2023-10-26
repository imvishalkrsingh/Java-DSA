/*
Q. Friend Pairing Problem :
-Given n friends, each one can remain single or
 can be paired up with some other friend.
 Each friend can be paired only once.
 Find out the total number of ways in which
 friends can remain single or can be paired up.
 */
package Recursion;
import java.util.Scanner;
public class FriendsPairing {

    public static int friendsPairing(int n){
        //Base Case
        if(n == 1 || n == 2){
            return n;
        }

        //choice
        // single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);

        int pairWays = (n-1) * fnm2;

        //TotalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;

        // write in a single line
//        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of friends : ");
        int n = sc.nextInt();

        System.out.print("Total Ways of pairing : ");
        System.out.println(friendsPairing(n));;
    }
}
