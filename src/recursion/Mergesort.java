package recursion;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        mergeInplace(arr,0,arr.length);
        int[] ascarr = mergeasc(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(ascarr));
    }
    private static int[] merge(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
        int [] right = merge(Arrays.copyOfRange(arr,mid,arr.length));
        return sortedArr(left,right);
    }
    private static int[] sortedArr(int[] left, int[] right) {
        int[] arr  = new int[left.length + right.length];
        int k = 0;
        int i =0;
        int j  = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = right[j++];
            }else{
                arr[k] = left[i++];
            }
            k++;
        }
        while(i < left.length){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length){
            arr[k] = right[j];
            k++;
            j++;
        }
        return arr;
    }
    private static int[] mergeasc(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeasc(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeasc(Arrays.copyOfRange(arr,mid,arr.length));
        return sortedArrAsc(left,right);
    }
    private static int[] sortedArrAsc(int[] left, int[] right) {
        int[] arr  = new int[left.length + right.length];
        int k = 0;
        int i =0;
        int j  = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = left[i++];
            }else{
                arr[k] = right[j++];
            }
            k++;
        }
        while(i < left.length){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length){
            arr[k] = right[j];
            k++;
            j++;
        }
        return arr;
    }
    static void mergeInplace(int[] arr,int s,int e){
            if(e-s == 1){
                return;
            }
            int mid = s + (e - s) /2;
            mergeInplace(arr,s,mid);
            mergeInplace(arr,mid,e);
            mergeinplacesort(arr,s,mid,e);
    }
    private static void mergeinplacesort(int[] arr, int s, int m,int e) {
            int[] mix = new int[e-s];
            int i = s;
            int j = m;
            int k = 0;
            while(i <  m && j < e){
                if(arr[i] < arr[j]){
                    mix[k++] = arr[i++];
                }else{
                    mix[k++] = arr[j++];
                }
            }
            while(i < m){
                mix[k++] = arr[i++];
            }

        while(j < e){
            mix[k++] = arr[j++];
        }
        for(int f =0;f<mix.length;f++){
            arr[s+f] = mix[f];
        }
    }
}
