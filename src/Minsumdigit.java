void main() {
    int[] nums = {999, 19, 199};
    IO.println(minElement(nums));
//        System.out.println(sumVal(25));
}

public static int minElement(int[] nums) {
    int min = Integer.MAX_VALUE;
    for (int num : nums) {
        if (num == 1) return 1;
        int sum = num > 9 ? sumVal(num) : num;
        min = Math.min(sum, min);
    }
    return min;
}

public static int sumVal(int n) {
    int sum = 0;
    while (n > 0) {
        int temp = n % 10;
        sum += temp;
        n = n / 10;
    }
    return sum;
}
