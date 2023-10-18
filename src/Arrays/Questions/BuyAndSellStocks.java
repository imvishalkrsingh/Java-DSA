package Arrays.Questions;
import java.util.Scanner;
public class BuyAndSellStocks {

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of days : ");
        int days = sc.nextInt();

        int[] prices = new int[days];

        System.out.println("Enter " + days + " Prices : ");
        for (int i = 0; i < days; i++){
            prices[i] = sc.nextInt();
        }

        System.out.println(buyAndSellStocks(prices));
    }
}
