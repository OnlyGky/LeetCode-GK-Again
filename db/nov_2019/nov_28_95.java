package db.nov;


import java.util.LinkedList;
import java.util.List;
//95，不同的二叉搜索树II
public class nov_28_95 {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0)
            return new LinkedList<TreeNode>();
        return create(1, n);
    }
    public List<TreeNode> create(int s, int e){
        List<TreeNode>allTree = new LinkedList();
        if(s > e){
            allTree.add(null);
            return allTree;
        }
        List<TreeNode>left = new LinkedList();
        List<TreeNode>right = new LinkedList();
        for(int i = s; i <= e; i++){
            left = create(s, i-1);
            right = create(i+1,e);
            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode current_tree = new TreeNode(i);
                    current_tree.left = l;
                    current_tree.right = r;
                    allTree.add(current_tree);
                }
            }
        }
        return allTree;
    }

}
