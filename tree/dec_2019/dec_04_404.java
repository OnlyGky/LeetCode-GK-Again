package tree.dec_2019;
//404. 左叶子之和
public class dec_04_404 {
    int re = 0;
    TreeNode pre = null;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        if(root.left == null && root.right == null){
            if (pre != null && pre.left == root)
                re +=root.val;
            return re;
        }
        pre = root;
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return re;
    }
}
