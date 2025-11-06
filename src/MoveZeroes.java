import java.util.*;

public class MoveZeroes {
    public static void moveZero(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            if(arr[left] !=0){
                left++;
            } else if (arr[left] == 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                right--;
            }
        }
    }
    static void main(String[] args) {
        int arr[] = {1,0,2,5,0,5,20,0,4,7,0,0,9};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));

    }
}
