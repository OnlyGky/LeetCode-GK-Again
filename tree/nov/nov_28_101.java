package tree.nov;
//101. 对称二叉树
public class nov_28_101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode one,TreeNode two){
        if(one == null && two == null)
            return true;
        if(one == null || two == null || two.val != one.val)
            return false;
        else {return isMirror(one.left, two.right) && isMirror(one.right, two.left);}

    }
}
