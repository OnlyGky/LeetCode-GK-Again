package tree.nov;

public class nov_29_109 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length-1);
    }
    public TreeNode createTree(int []nums, int start, int end){
        if(start > end)
            return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createTree(nums, start, mid-1);
        root.right = createTree(nums, mid+1, end);
        return root;
    }

}
