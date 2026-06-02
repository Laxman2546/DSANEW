package striver;

import java.util.ArrayList;
import java.util.List;

public class Pascaltriangle {

    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>>ls  =pascal(n);
        System.out.println(ls);
    }
    private static List<List<Integer>> pascal(int n) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> ls = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j == i || j == 0){
                    ls.add(1);
                }else{
                   ls.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
         res.add(ls);
        }
        return  res;
    }
}
