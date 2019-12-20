package tree.dec_2019;
//572. 另一个树的子树
public class dec_16_572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null)
            return true;
        if (fun(s, t))  return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    boolean fun(TreeNode s, TreeNode t){
        if (s == null && t == null)
            return true;
        else if (s == null || t == null)
            return false;
        if (s.val == t.val)
            return false;
        else return fun(s.left, t.left) && fun(s.right, t.right);
    }
}
