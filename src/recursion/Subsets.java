package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subset(arr));
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> lsmain = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            List<Integer> ls = new ArrayList<>();
            for(int j=i ;j<arr.length;j++){
                System.out.println(arr[i] +" " + arr[j]);
            }
            lsmain.add(ls);
        }
        return  lsmain;
    }
}
