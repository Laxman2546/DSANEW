public class DivisibleThree {
    public static int maxSumDivThree(int[] nums) {
        int totalSum = 0;
        int one_rem = Integer.MAX_VALUE;
        int two_rem = Integer.MAX_VALUE;

        for (int num : nums) {
            totalSum += num;
            int r = num % 3;

            if (r == 1) {
                // use temporary values to avoid overwriting
                two_rem = Math.min(two_rem, one_rem + num);
                one_rem = Math.min(one_rem, num);
            } else if (r == 2) {
                one_rem = Math.min(one_rem, two_rem + num);
                two_rem = Math.min(two_rem, num);
            }
        }

        if (totalSum % 3 == 0) return totalSum;
        if (totalSum % 3 == 1) return totalSum - one_rem;
        return totalSum - two_rem;

    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 5, 1, 8};
        System.out.println(maxSumDivThree(nums)); // 18
    }
}
