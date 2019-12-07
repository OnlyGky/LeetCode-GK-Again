package tree.dec_2019;

import java.util.ArrayList;
import java.util.List;

//257. 二叉树的所有路径
public class dec_03_257 {
    List<String>list = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return list;
        merge(root, new StringBuffer());
        return list;
    }
    public void merge(TreeNode root, StringBuffer str){
        if(root == null)
            return ;

        if(root.left == null && root.right == null){
            str.append(root.val);
            list.add(str.toString());
            return;
        }
        str.append(root.val+"->");
        StringBuffer s = new StringBuffer(str);
        merge(root.left, str);
        merge(root.right, s);

    }
}
