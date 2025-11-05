

public class LargestElement{
    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else {
                i++;
            }
        }
            return largest;
    }
        public static void main(String args[]){
        int arr[] = {1,2,3,5,25,8,12};
        int largestNum = findLargest(arr);
        System.out.println(largestNum);
    }
}