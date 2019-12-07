package tree.dec_2019;
//437. 路径总和 III
public class dec_04_437 {

    public int pathSum(TreeNode root, int sum) {
        return pathSum(root, sum, new int[1000], 0);
    }
    public int pathSum(TreeNode root, int sum, int[]arr, int end){
        if (root == null){
            return 0;
        }
        int temp = root.val;
        int n = root.val == sum ? 1:0;
        for (int i = end-1; i >=0; i--){
            temp+=arr[i];
            if (temp == sum){
                n++;
            }
        }
        arr[end] = root.val;
        int n1 = pathSum(root.left, sum, arr, end+1);
        int n2 = pathSum(root.right, sum, arr, end+1);
        return n+n1+n2;
    }
}
