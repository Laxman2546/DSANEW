public class Wavieness {
    public static void main(String[] args) {
        int nums1 = 198;
        int nums2 = 202;
        System.out.println(totalWaviness(nums1,nums2));
    }

    private static int  totalWaviness(int nums1, int nums2) {
        if(nums2 < 100)return 0;
        int count = 0;
        for(int i =nums1;i<=nums2;i++){
            String num = Integer.toString(i);
            count += isWave(num);
        }
        return count;
    }

    private static int isWave(String num) {
        char[] digit = num.toCharArray();
        int count = 0;
        for (int i=1;i<digit.length-1;i++){
            if(digit[i] > digit[i-1] && digit[i] > digit[i+1]){
                    count = count + 1;
            }
            if(digit[i] < digit[i-1] && digit[i] < digit[i+1]){
                count = count + 1;
            }
        }

        return  count;
    }
}
