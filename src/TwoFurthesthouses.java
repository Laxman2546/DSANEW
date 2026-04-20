public class TwoFurthesthouses {
    public static void main(String[] args) {
        int[] colors = {1,1,1,6,1,1,1};
        System.out.println(maxDistance(colors));
        System.out.println(maxdistance2(colors));
    }

    private static int maxdistance2(int[] colors) {
        int maxdist = 0;
        for(int i=0;i<colors.length;i++){
            for (int j=i+1;j<colors.length;j++){
                if(colors[i] !=colors[j]){
                    maxdist = Math.max(maxdist,Math.abs(i-j));
                }
            }
        }
            return maxdist;
    }

    private static int maxDistance(int[] colors) {
        int left =0;
        int right = colors.length-1;
        int maxdist = 0;
        while(left < right){
            if(colors[left] != colors[right]){
                maxdist = Math.abs(Math.max(maxdist ,right - left));
                left++;
            }else{
                right--;
            }
        }
        return maxdist;
    }
}
