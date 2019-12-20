package tree.dec_2019;
//538. 把二叉搜索树转换为累加树
public class dec_15_538 {
    //把中序的左右顺序调换
    public TreeNode convertBST(TreeNode root) {
        if(root == null)
            return root;
        TreeNode head = root;
        MergeBST(head);
        return root;
    }
    int re = 0;
    public void MergeBST(TreeNode root){
        if(root == null)
            return;
        MergeBST(root.right);
        root.val += re;
        re =root.val;//记录上一个节点的值
        MergeBST(root.left);
    }

}
