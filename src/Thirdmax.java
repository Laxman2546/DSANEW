class Solution2 {
    public int thirdMax(int[] arr) {
        // Use Long.MIN_VALUE or null to stay below the integer range
        Long first = null, second = null, third = null;

        for (int n : arr) {
            // Use Long.valueOf to compare objects correctly
            Long val = Long.valueOf(n);

            // Skip duplicates
            if (val.equals(first) || val.equals(second) || val.equals(third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = val;
            } else if (second == null || n > second) {
                third = second;
                second = val;
            } else if (third == null || n > third) {
                third = val;
            }
        }

        // If third is still null, return first; otherwise return third
        return (third == null) ? first.intValue() : third.intValue();
    }
}
public class Thirdmax {
    public  static void main(String[] args) {
            int first = 0,second=0,third=0;
            int[] arr = {1,2,2,5,3,5};
            for(int i=0;i<arr.length;i++){

                if(arr[i] > first){
                    third = second;
                    second = first;
                    first = arr[i];
                } else if (arr[i] > second) {
                    third = second;
                    second = arr[i];
                }else if(arr[i] > third){
                    third = arr[i];
                }
            }
        System.out.println(third);
    }
}
