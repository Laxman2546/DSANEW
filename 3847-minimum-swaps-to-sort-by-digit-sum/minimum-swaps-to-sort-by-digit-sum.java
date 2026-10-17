class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] digitArr = new int[n][2];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int temp = nums[i];
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            digitArr[i][0] = sum;
            digitArr[i][1] = nums[i];
        }
        Arrays.sort(digitArr, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < digitArr.length; i++) {
            hm.put(digitArr[i][1], i);
        }
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int j = i;
            int cycleSize = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = hm.get(nums[j]);
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += cycleSize - 1;
            }
        }

        return swaps;
    }
}