package db.sep_2019;

import java.util.ArrayList;
import java.util.List;

//120. 三角形最小路径和
public class sep_28_120 {


    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> list = triangle.get(triangle.size()-1);
        List<Integer> temp = new ArrayList<>();
        for (int i = triangle.size()-2; i >= 0; i--){
            for (int j = 0; j < triangle.get(i).size(); j++){

                temp.add(triangle.get(i).get(j)+Math.min(list.get(j),list.get(j+1)));
            }
            list = new ArrayList(temp);
            temp.clear();
        }
        return list.get(0);
    }
/*
    public int minimumTotal(List<List<Integer>> triangle) {
        int size=triangle.size();
        int [][]result=new int[size][size];
        for(int i=0;i<size;i++){
            result[size-1][i]=triangle.get(size-1).get(i);
        }
        for(int i=size-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                result[i][j]=Math.min(result[i+1][j],result[i+1][j+1])+triangle.get(i).get(j);
            }
        }
        return result[0][0];
    }
    */
}
