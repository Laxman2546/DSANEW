import java.util.Stack;

public class MountainArray {
    public static boolean checkMountain(int[] arr){

            int n = arr.length;

            // 1. Initial Check: The array must have at least 3 elements.
            if (n < 3) {
                return false;
            }

            int i = 0;

            // 2. Walk Up (Strictly Increasing Phase)
            // Find the index of the peak element.
            // We stop when we reach the end or the next element is NOT greater than the current one.
            while (i < n - 1 && arr[i] < arr[i + 1]) {
                i++;
            }

            // 3. Peak Check (Ensure a valid peak was found)
            // A valid peak index 'i' must not be the first element (i > 0)
            // and must not be the last element (i < n - 1).
            // If i is 0, it means the array was never strictly increasing (e.g., [5, 4, 3]).
            // If i is n-1, it means the array was strictly increasing all the way (e.g., [1, 2, 3]).
            if (i == 0 || i == n - 1) {
                return false;
            }

            // 4. Walk Down (Strictly Decreasing Phase)
            // Continue from the peak index and check if the array is strictly decreasing.
            while (i < n - 1 && arr[i] > arr[i + 1]) {
                i++;
            }

            // 5. Final Result Check
            // If 'i' has reached the very last element of the array (n - 1),
            // it means the entire array was successfully traversed:
            // it strictly increased, reached a peak, and then strictly decreased to the end.
            return i == n - 1;
    }
    public static void main(String[] args) {
        int[] arr  = {2,1,2,3,10,5,4,3,2,1};
        boolean isMountain = checkMountain(arr);
        System.out.println(isMountain);
    }
}
