import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Disappered {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList <Integer> al = new ArrayList<>();
        HashSet hs = new HashSet<>();

        int ListSize = al.size();
        for(int num:nums){

            hs.add(num);
        }
        System.out.println(hs);
        for(int i =1;i<nums.length+1;i++){
            if(!hs.contains(i)){
                al.add(i);
            }

        }


        return al;
    }

    public static void main(String[] args) {
               int arr[] = {1,1};
               List check = findDisappearedNumbers(arr);
               System.out.println(check);
    }
}
