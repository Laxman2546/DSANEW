public class Missing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(missingNum(arr));
    }
    static int missingNum(int[] arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i] == 0) continue;
            int num = arr[i] - 1 ;
            arr[num] = 0;
        }
        int ans = arr.length + 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0)return ans + 1;
        }
        return ans;
    }
}
