package tree.dec_2019;
//606. 根据二叉树创建字符串
public class dec_17_606 {
    StringBuffer sr = new StringBuffer();
    public String tree2str(TreeNode t) {
        if (t == null)
            return "";
        sr.append(t.val);
        if(t.left!= null || t.right!= null){
            if (t.left != null){
                sr.append("(");
                tree2str(t.left);
                sr.append(")");
            }else{
                sr.append("(");
                sr.append(")");
            }
            if (t.right != null){
                sr.append("(");
                tree2str(t.right);
                sr.append(")");
            }
        }
        return sr.toString();
    }
}
