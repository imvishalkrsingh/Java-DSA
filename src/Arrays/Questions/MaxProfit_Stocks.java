/*
You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
 Example 1:Input:prices = [7, 1, 5, 3, 6,  4]
 Output: 5
 Explanation:Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */

package Arrays.Questions;
import java.util.Scanner;
public class MaxProfit_Stocks {

    public static int maxProfit(int [] arr){
        int buy = arr[0];
        int profit = 0;

        for(int i = 0; i < arr.length; i++){
            if(buy < arr[i]){
                profit = Math.max(arr[i] - buy, profit);
            }else{
                buy = arr[i];
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter days of Stocks : ");
        int days = sc.nextInt();

        int prices[] = new int[days];

        System.out.println("Enter " + days + " Prices : ");
        for (int i = 0; i < days; i++){
            prices[i] = sc.nextInt();
        }

        System.out.println(maxProfit(prices));
    }
}
