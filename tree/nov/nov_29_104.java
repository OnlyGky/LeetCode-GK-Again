package tree.nov;
//104. 二叉树的最大深度
public class nov_29_104 {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
}
