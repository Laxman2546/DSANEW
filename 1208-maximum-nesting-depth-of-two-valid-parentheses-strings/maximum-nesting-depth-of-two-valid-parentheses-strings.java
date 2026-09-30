class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int depthCount = 0;
        int[] res = new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i) == '('){
                res[i] =depthCount % 2;
                depthCount++;
            }else{
                depthCount--;
                res[i] =depthCount % 2;
            }
        }
        return res;
    }
}