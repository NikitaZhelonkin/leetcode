
public class BestTimeToBuyAndSellStock {
    // O(n) Similar to MaxSubArray
//    public int maxProfit(int[] prices) {
//        int lastMaxProfit = 0;
//        int max = 0;
//        for (int i = 1; i < prices.length; i++) {
//            int profit = prices[i] - prices[i - 1];
//            lastMaxProfit = lastMaxProfit<0? profit : profit + lastMaxProfit;
//            max = lastMaxProfit > max ? lastMaxProfit : max;
//        }
//        return max;
//
//    }

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = prices[i] - minPrice > maxProfit ? prices[i] - minPrice : maxProfit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 10}));
    }
}
