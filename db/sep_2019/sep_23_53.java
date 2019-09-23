package db.sep_2019;

public class sep_23_53 {
    public static void main(String[] args) {
        System.out.println(new sep_23_53().maxSubArray(new int[]{1,2}));
    }

    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int max = 0;
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            if(max <= 0)
                max = nums[i];
            else max +=nums[i];
            if(count < max)
                count = max;
        }
        return count;
    }
}
