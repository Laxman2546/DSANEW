import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public  static int[] intersection(int[] arr,int[] arr2){
        int i =0,j=0;
        HashSet<Integer> hm = new HashSet<>();
        while(i<arr.length && j < arr2.length){
            if(arr[i] == arr2[j]){
                hm.add(arr[i]);
                i++;
                j=0;
            }else{
            j++;
            }
            if(j == arr2.length){
                j=0;
                i++;
            }
        }
        int[] res = new int[hm.size()];
        int k =0;
        for(int num : hm){
            res[k++] = num;
        }
        return res;
    }
    public static void main(String[] args) {
            int [] arr = {2,1};
            int[] arr2 = {1,2};
        System.out.println(Arrays.toString(intersection(arr,arr2)));

    }

}
