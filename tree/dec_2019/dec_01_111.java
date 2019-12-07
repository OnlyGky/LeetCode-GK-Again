package tree.dec_2019;


// 111 二叉树的最小深度
public class dec_01_111 {
    public int minDepth(TreeNode root) {//需要判断根节点只有一个子结点的情况
        if(root == null)
            return 0;
        if(root.left == null || root.right == null){
            return minDepth(root.left)+minDepth(root.right)+1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
