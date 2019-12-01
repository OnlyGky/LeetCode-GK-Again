package tree.nov;
//105. 从前序与中序遍历序列构造二叉树
public class nov_28_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null && inorder == null)
            return null;
        return createTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
    public TreeNode createTree(int[]pre,int ps, int pe, int [] in, int is,int ie){
        if(ps > pe || is > ie)
            return null;
        int rootVal = pre[ps];
        TreeNode root = new TreeNode(rootVal);
        for(int i = is; i <= ie; i++){
            if(in[i] == rootVal){
                root.left = createTree(pre, ps+1, ps - is +i, in, is, i-1);
                root.right = createTree(pre, pe-ie+i+1, pe, in, i+1, ie);
                break;
            }
        }
        return root;
    }
}
