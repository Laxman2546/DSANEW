package recursion;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[] = {5,4,7,8,2,1};
//        selection1(arr);
//        bubble(arr);
//        recursive1(arr,0,arr.length-1);
        recursive2(arr,0,arr.length,0);
        System.out.println(Arrays.toString(arr));
//        recursive2(arr);
//        System.out.println(Arrays.toString(arr));
    }

    private static void recursive2(int[] arr, int c, int r,int max) {
            if(r == 0) return;
            if(c < r){
                if(arr[c] > arr[max]){
                    recursive2(arr,c+1,r,c);
                }else{
                    recursive2(arr,c+1,r,max);
                }
            }else{
                int temp = arr[max];
                arr[max] = arr[r-1];
                arr[r-1] = temp;
                recursive2(arr,0,r-1,0);
            }
    }

    private static void recursive1(int[] arr,int c,int r) {
        if(r < 0) return;
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            recursive1(arr,c+1,r);
        }else{
            recursive1(arr,0,r-1);
        }
    }

    private static void bubble(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
    }

    private static void selection1(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int max = 0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }
    }

}
