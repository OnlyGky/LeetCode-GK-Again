package tree.dec_2019;
//98. 验证二叉搜索树
public class dec_03_98 {
    //使用递归实现，具体思路还有中序遍历
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        if(!isValidBST(root.left)) return false;
        if(pre != null && pre.val >= root.val) return false;
        pre = root;
        return isValidBST(root.right);
    }
}
