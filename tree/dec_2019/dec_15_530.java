package tree.dec_2019;
//530. 二叉搜索树的最小绝对差
public class dec_15_530 {
    int count = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int getMinimumDifference(TreeNode root) {
        if(root == null)
            return 0;

        getMinimumDifference(root.left);
        if(pre != null)
            count = Math.min(count,Math.abs(root.val - pre.val));
        pre = root;
        getMinimumDifference(root.right);
        return count;
    }
}
