package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int i = num.length-1;
        List<Integer> ls = new ArrayList<>();
        subseque(num,i,ls);
    }

    private static void subseque(int[] num,int i,List<Integer> ls) {
        if(i <0){
            System.out.println(ls);
            return;
        }
        ls.add(num[i]);
        subseque(num,i-1,ls);
        ls.removeLast();
        subseque(num,i-1,ls);
    }

}
