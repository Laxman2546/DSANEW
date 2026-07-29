import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.PriorityQueue;
class Pairs{
    int value;
    int idx;
    public Pairs(int value,int idx){
            this.value = value;
            this.idx= idx;
    }
}

public class StringTrim {
    public static void main(String[] args) {
        String[] nums = {"102","473","251","814"};
        int[][] queries = {{1,1},{2,3},{4,2},{1,2}};
        System.out.println(Arrays.toString(trim(nums,queries)));
    }
    private static int[] trim(String[] nums, int[][] queries) {
        int[] res = new int [queries.length];
        int k = 0;
        for(int i=0;i<queries.length;i++){
                String[] digits = new String[nums.length];
                int kthsmallest = queries[i][0];
                int trimCount  = queries[i][1];
                for(int j=0;j<nums.length;j++){
                    digits[j] = nums[j].substring(nums[j].length()-trimCount);
                }
                    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                    HashMap<Integer,Integer> hm = new HashMap<>();
                    for(int l=0;l<digits.length;l++){
                     pq.add(Integer.parseInt(digits[l]));
                     hm.put(Integer.parseInt(digits[l]),l);
                    if(pq.size() > kthsmallest){
                        pq.poll();
                    }
                    }
                    res[k++] = pq.peek() != null ? hm.get(pq.peek()) : 0;
            System.out.println(Arrays.toString(digits));
        }
        return res;
    }
}


//coin problem
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coins = sc.nextLine();
        System.out.println(maxGold(coins));
    }
    public static int maxGold(String coins){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<coins.length();i++){
            char coin = coins.charAt(i);
            hm.put(coin,hm.getOrDefault(coin,0)+1);
        }
        int bronze = hm.containsKey('B') ? hm.get('B')/3 : 0;
        int silver =hm.containsKey('S') ?  (hm.get('S')/3) + bronze : 0;
        int gold = hm.get('G') + silver;
        return gold;
    }
}