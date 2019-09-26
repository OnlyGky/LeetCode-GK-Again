package db.sep_2019;
//303. 区域和检索 - 数组不可变
public class sep_26_303 {
    int [] nums = null;
  /*  public NumArray(int[] nums) {
        this.nums = nums;
        if(nums.length >1)
            for(int i = 1; i < nums.length; i++)
                nums[i]+=nums[i-1];
    }*/

    public int sumRange(int i, int j) {
        return i ==0 ?nums[j]:nums[j]-nums[i-1];
    }
}
