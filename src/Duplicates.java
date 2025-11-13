import java.util.HashSet;

public class Duplicates {
        public static boolean checkDuplicates(int[] arr){
            HashSet hs = new HashSet(arr.length);
            for(int num:arr){
                if(hs.contains(num)){
                    return true;
                }
                hs.add(num);
            }
            return false;
        }

    public static void main(String[] args) {
    int [] arr = {1,2,3,4};
    boolean isDup = checkDuplicates(arr);
    System.out.println(isDup);
    }
}
