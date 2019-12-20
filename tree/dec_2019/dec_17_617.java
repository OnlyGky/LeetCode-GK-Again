package tree.dec_2019;
//617. 合并二叉树
public class dec_17_617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root = t1;

        return merge(t1, t2);
    }
    public TreeNode merge(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null)
            return null;
        if(t1 == null || t2 == null){
            return t1 == null ? t2 : t1;
        }
        t1.val = (t1.val+t2.val);
        t1.left = merge(t1.left, t2.left);
        t1.right = merge(t1.right, t2.right);
        return t1;

    }
}
