package db.sep_2019;

public class sep_23_70 {
    public int climbStairs(int n) {
        if(n <4)
            return n;
        int one = 2;
        int two = 3;
        for(int i = 4; i <= n;i++ ){
            int temp = two;
            two = one + two;
            one = temp;
        }
        return two;
    }
}
