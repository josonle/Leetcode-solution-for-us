public class Topic122-lixstudy-BTTBASS2{
    public int maxProfit(int[] prices) {
        if (prices==null||prices.length<2) {
            return 0;
        }
        int res =0;
        for (int i = 0; i < prices.length-1; i++) {
            res = prices[i+1]>prices[i]?res+prices[i+1]-prices[i]:res;
        }
        return res;
    }
}