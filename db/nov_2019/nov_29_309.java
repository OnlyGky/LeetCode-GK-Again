package db.nov;
//309. 最佳买卖股票时机含冷冻期
public class nov_29_309 {
    public int maxProfit(int[] prices) {
        int sold = 0;//卖出股票
        int rest = 0;//什么都不做
        int hold = Integer.MIN_VALUE; //继续持有股票
        for(int p : prices){
            int pre_sold = sold;
            sold = hold + p;//前一天持有股票，当日卖出
            hold = Math.max(hold, rest -p);//前一天持有或者今日买入
            rest = Math.max(rest, pre_sold);//继续持有今日卖出
        }
        return Math.max(sold, rest);
    }
}
