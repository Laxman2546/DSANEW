class Solution {
    public int overLaps(int[][] img1, int[][] img2,int i,int j){
        int n = img1[0].length;
        System.out.println(n);
        int count = 0;
        for(int k = 0;k<n;k++){
            for(int l=0;l<n;l++){
                int a = k + i;
                int b = l + j;
                if(a < 0 || a >= n || b < 0 || b >= n){
                    continue;
                }
                if(img1[k][l] == 1 &&  img2[a][b] == 1){
                    count++;
                }
            }
        }
        return count;
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1[0].length;
            int maxOverLap = 0;
            for(int i=-n+1;i<n;i++){
                for(int j=-n+1;j<n;j++){
                        int count = overLaps(img1,img2,i,j);
                        maxOverLap = Math.max(maxOverLap,count);
                }
            }
        return maxOverLap;

    }
}