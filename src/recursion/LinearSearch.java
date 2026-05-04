package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        System.out.println(searchArr(arr,target,0));
    }

    private static int searchArr(int[] arr,int target,int idx) {
        if(arr.length == 0) return -1;
        if(arr[idx] == target){
            return idx;
        }else{
        return searchArr(arr,target,idx+1);
        }
    }
}
