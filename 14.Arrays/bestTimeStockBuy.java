public class bestTimeStockBuy {

    public static int stock(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buy < prices[i]) {  //profit
                int profit = prices[i] - buy;  // today profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int op = stock(prices);
        System.out.println(op);
    }

}
