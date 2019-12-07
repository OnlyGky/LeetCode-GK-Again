package tree.dec_2019;
//235. 二叉搜索树的最近公共祖先
public class dec_02_235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if((root.val - p.val) * (root.val - q.val) <= 0){//当前为最近
            return root;
        }else if(root.val - p.val > 0){//如果都在左子树上，则已左节点为根节点
            root = lowestCommonAncestor(root.left, p, q);
        }else {
            root = lowestCommonAncestor(root.right, p, q);//已由节点为根节点
        }
        return root;
    }
}
