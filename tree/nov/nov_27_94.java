package tree.nov;


import java.util.*;

public class nov_27_94 {
//    List<Integer> list = new ArrayList<Integer>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        if(root == null){
//            return list;
//        }
//        inorderTraversal(root.left);
//        list.add(root.val);
//        inorderTraversal(root.right);
//        return list;
//    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<>();
        Stack<TreeNode>stack =new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }
}
