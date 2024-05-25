package Arrays;

public class MaxProfitInStocks {

    public static void main(String[] args) {

        int[] a = {10, 19, 1, 32, 30};

        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] prices) {
        //You can code here

        int min = Integer.MAX_VALUE, maxProfit = Integer.MIN_VALUE;

        for(int i: prices) {
            min = Math.min(min, i);
            maxProfit = Math.max(maxProfit, i - min);
        }

        return maxProfit;
    }
}
