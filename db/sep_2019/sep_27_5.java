package db.sep_2019;
//5. 最长回文子串
public class sep_27_5 {
    /**
     public String longestPalindrome(String s) {
     int n = s.length();
     String res = "";
     boolean[][] dp = new boolean[n][n];
     for (int i = n - 1; i >= 0; i--) {
     for (int j = i; j < n; j++) {
     dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1]); //j - i 代表长度减去 1
     if (dp[i][j] &&  j - i + 1 > res.length()) {
     res = s.substring(i, j + 1);
     }
     }
     }
     return res;
     }
     */

    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        boolean []P = new boolean[n];//对比上面的运算过程发生每一次运算i是不变的，所以可以使用一维数组
        for (int i = n - 1; i >=0; i--){//这其实是一个右上角三角形
            for (int j = n-1; j >=i; j--){
                P[j] = s.charAt(i) == s.charAt(j) &&(j-i < 3 || P[j-1]);
                if (P[j] && j - i + 1 > res.length())
                    res = s.substring(i, j+1);
            }
        }
        return res;
    }
}
