package db.sep_2019;

public class sep_24_121 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <1)
            return 0;
        int buy = Integer.MAX_VALUE;
        int price = 0;
        for (int index : prices){
            buy = Math.min(buy, index);
            price = Math.max(price, index - buy);
        }
        return price;
    }
}
