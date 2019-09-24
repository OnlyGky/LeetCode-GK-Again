package db.sep_2019;

public class sep_24_198 {
    public int rob(int[] nums) {
        if(nums == null || nums.length < 1)
            return 0;
        int count = 0;
        if( nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0], nums[1]);
        for(int i = 0; i < 3; i++){
            if(count < nums[i])
                count = nums[i];
        }
        if(count < (nums[2]+=nums[0]))
            count = nums[2];
        for (int i = 3; i < nums.length; i++){
            nums[i]+=(Math.max(nums[i-2],nums[i-3]));
            if(count < nums[i])
                count = nums[i];
        }
        return count;
    }
/* 网上的思路
    public int rob(int[] num) {
        int prevMax = 0;
        int currMax = 0;
        for (int x : num) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }
*/
}
