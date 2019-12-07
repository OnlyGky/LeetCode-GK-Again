package tree.dec_2019;

import java.util.LinkedList;
import java.util.List;

//501. 二叉搜索树中的众数
public class dec_06_501 {
    List<Integer> list = new LinkedList();
    TreeNode pre = null;
    int maxTime = 0;
    int thisTime = 0;
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] re = new int[list.size()];
        for(int i = 0; i < re.length; i++){
            re[i] = list.get(i);
        }
        return re;
    }
    public void inOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        if(pre != null && pre.val == root.val){
            thisTime++;
        }else{
            thisTime = 1;
        }
        if(thisTime == maxTime){
            list.add(root.val);
        }else if(thisTime > maxTime){
            list.clear();
            list.add(root.val);
            maxTime = thisTime;
        }
        pre = root;
        inOrder(root.right);
    }

}
