import java.util.Arrays;
import java.util.HashSet;

public class PrefixArr {
    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        int[] res = findThePrefixCommonArray(A,B);
        System.out.println(Arrays.toString(res));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int l = 0;
        int r = 0;
        int count = 0;
        int k = 0;
        int[] arr = new int[A.length];
        HashSet<Integer> hs = new HashSet<>();
        while(l < A.length && r < B.length){
            if(A[l] == B[r]){
                count++;
            }

            if(hs.contains(A[l])){
                count++;
            }
            if(hs.contains(B[r])){
                count++;
            }
            if(!hs.contains(A[l]) || !hs.contains(B[r])){
                hs.add(A[l]);
                hs.add(B[r]);
            }
            arr[k++] = arr[k-1] + count;
            l++;
            r++;
        }
        return arr;
    }
}
