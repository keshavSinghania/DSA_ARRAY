public class BestTimeToBuyAndSellStock {
}

//class Solution {
//    public int maxProfit(int[] prices) {
//        //price you preferr to buy then definately sell it on upcoming day
//        int minPrice = Integer.MAX_VALUE;
//        int maxProfit = 0;
//        for(int i=0; i<prices.length; i++){
//            //is today minimum price then all previou days
//            if(prices[i]<minPrice){
//                minPrice = prices[i];
//            }else{
//                //oh today,s price is higher than the previous price lets chcek profit
//                int profit = prices[i]-minPrice;
//                if(profit>maxProfit){
//                    maxProfit = profit;
//                }
//            }
//        }
//        return maxProfit;
//    }
//}