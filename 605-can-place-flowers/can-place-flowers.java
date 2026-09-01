class Solution {
    public boolean canPlaceFlowers(int[] n, int k) {
        if(n.length <= 1 && n[0] == 0){
            k--;
            return k <= 0; 
        }
        if(n[0] == 0 && n[1] == 0){
            n[0] = 1;
            k--;
        }
        for(int i=1;i<n.length-1;i++){
            if(n[i-1] == 0 && n[i+1] == 0 && n[i] == 0){
                n[i]=1;
                k--;
            }
        }
         if(n[n.length-1] == 0 && n[n.length-2] == 0){
            n[n.length-1] = 1;
            k--;
        }
        return k <= 0;
    }
}