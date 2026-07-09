package graphs;

import java.util.Arrays;

public class PathExistence {
    public static void main(String[] args) {
        int[] nums = {2,5,8,6,7,6};
        int maxDiff = 2;
        int[][] que = {{0,2},{2,4},{2,4},{1,5}};
        int n=3;
        boolean[] ans = pathExistenceQueries(n,nums,maxDiff,que);
        System.out.println(Arrays.toString(ans));
    }
    public  static boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] comp = new int[nums.length];
        for(int i=1;i<nums.length;i++){
            int diff = Math.abs(nums[i-1] - nums[i]);
            if(diff <= maxDiff){
                comp[i]=comp[i-1];
            }else{
                comp[i]=i;
            }
        }
        boolean[] ans = new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            int node1 = queries[i][0],node2=queries[i][1];
            if(comp[node1] == comp[node2]){
                ans[i]=true;
            }
        }
        return ans;
    }

}

