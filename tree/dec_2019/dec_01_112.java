package tree.dec_2019;
// 112. 路径总和
public class dec_01_112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        if(root.left==null&&root.right==null){ //叶子节点才进行判断
            return sum-root.val==0;
        }
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);

    }
}
