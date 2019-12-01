package tree.nov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//107. 二叉树的层次遍历 II
public class nov_29_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>lists =new ArrayList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if(root==null) {
            return lists;
        }
        queue.offer(root);
        List<Integer>list=null;
        while(!queue.isEmpty()) {
            int t=queue.size();
            list=new ArrayList<Integer>();
            while(t>0) {

                root=queue.poll();
                list.add(root.val);
                if(root.left!=null) queue.offer(root.left);
                if(root.right!=null) queue.offer(root.right);
                t--;
            }
            lists.add(list);
        }
        List<List<Integer>>liststwo =new ArrayList <List<Integer>>();
        for(int i=lists.size()-1;i>=0;i--){
            liststwo.add(lists.get(i));
        }
        return liststwo;
    }
}
