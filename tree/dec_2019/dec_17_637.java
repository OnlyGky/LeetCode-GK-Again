package tree.dec_2019;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//637. 二叉树的层平均值
public class dev_17_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return list;
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            int t =queue.size();
            double ava=0;
            int flag=0;
            while(t>0) {
                flag=1;
                root=queue.poll();
                ava=ava+root.val;
                if(root.left!=null) queue.offer(root.left);
                if(root.right!=null) queue.offer(root.right);
                t--;
            }
            if(flag==1)
                list.add(ava*1.0/size);
        }
        return list;
    }
}
