import java.util.Arrays;

public class MergeSort {
        public static  void mergeSort(int[] arr,int st,int end){
           if(st >= end){
               return;
           }
           int mid = (st+end)/2;
           mergeSort(arr,st,mid);
           mergeSort(arr,mid+1,end);
           mergeInplace(arr,st,mid,end);
        }
        public static void mergeInplace(int[] arr,int s,int mid,int end){
            int[] mix = new int[end-s+1];
            int i = s;
            int j = mid+1;
            int k = 0;
                while (i <= mid && j <= end){
                    if(arr[i] < arr[j]){
                        mix[k] = arr[i];
                        i++;
                        k++;
                    }else{
                        mix[k] = arr[j];
                        j++;
                        k++;
                    }

                }
            while(i <= mid){
                mix[k] = arr[i];
                i++;
                k++;
            }
            while (j<= end){
                mix[k] = arr[j];
                j++;
                k++;
            }
            for (int l = 0; l < mix.length; l++) {
                arr[s + l] = mix[l];
            }

        }
   public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
