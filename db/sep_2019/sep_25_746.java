package db.sep_2019;

public class sep_25_746 {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length > 2)
        for (int i = 2; i < cost.length;i++){
            cost[i] +=Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}