class Solution {
    public int maxProfit(int[] prices) {
        int b = Integer.MAX_VALUE;
        int m = 0;
        for(int i =0;i<prices.length;i++){
            if(b<prices[i]){
                int profit = prices[i] - b;
                m = Math.max(m,profit);

            }else{
                b = prices[i];
            }
        }
        return m;
        
    }
}