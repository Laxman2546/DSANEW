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
//    public List<List<Integer> sub(int i, List<List<Integer>> rs,int[] nums){
//        List<Integer> ls = new ArrayList<>();
//        if(i < 0){
//            rs.add(ls);
//            return rs;
//        }
//        ls.add(nums[i]);
//        sub(i-1,rs,nums);
//        ls.removeLast();
//        sub(i-1,rs,nums);
//    }
}
