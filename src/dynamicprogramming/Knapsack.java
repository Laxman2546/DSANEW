package dynamicprogramming;

public class Knapsack {
    public static void main(String[] args) {
        int[] value = {5,3,9,16};
        int[] weights = {1,2,8,10};
        int C = 8;
        System.out.println(calculate(value,weights,C,0));
    }

    private static int calculate(int[] v, int[] w, int c, int i) {
        if (i == w.length) {
            return 0;
        }
        int skip = calculate(v, w, c, i + 1);
        if (w[i] > c) return skip;
        int pick = v[i] + calculate(v, w, c - w[i], i + 1);
        return Math.max(pick, skip);
    }
}
