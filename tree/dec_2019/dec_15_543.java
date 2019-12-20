package tree.dec_2019;
//543. 二叉树的直径
public class dec_15_543 {
    //计算每个节点的左右节点的高度之和，ans是用来记录的，防止出现不经过根节点的情况
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    public int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
    }
}
