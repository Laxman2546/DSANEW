public class Binarysearch {
    public static int binarySearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        int st = 0;
        int end = arr.length-1;

        while(st<= end){
        int mid = st+(end-st)/2;
        if(arr[mid] == target){
            return mid;
        } else if (target > arr[mid]) {
            st=mid+1;
        }else{
            end = mid-1;
        }
        }
        return -1;
    }
   public static void main(String[] args) {
       int [] arr ={1,2,5,15,25,38,62};
       int target = 150;
      int idx = binarySearch(arr,target);
       System.out.println(idx);
    }
}
