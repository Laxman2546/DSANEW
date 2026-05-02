package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,24,34,36,45,48,56,68,98,105};
        int target = 105;
        int res= search(arr,target,0,arr.length-1);
        System.out.println(res);
    }

    private static int search(int[] arr, int target, int st, int end) {
        if(st > end) return -1;
        int mid = st + (end-st)/2;
        if(arr[mid] == target) return mid;
        if(target > arr[mid]){
        return  search(arr,target,mid + 1,end);
        }
        return search(arr, target, st, mid-1);
    }
}
