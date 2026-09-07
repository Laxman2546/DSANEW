class Solution {
    private static final int MOD = 1_000_000_007; 
    public int distinctSubseqII(String s) {
        int[] memo = new int[s.length() + 1];
        Arrays.fill(memo,-1);
        return distinct(s,0,memo);
    }
    public int distinct(String s,int i ,int[] memo){
        if(memo[i] != -1) return memo[i];
        int c = 0;
        for(char ch = 'a'; ch <= 'z';ch++){
            int next = s.indexOf(ch,i);
            if(next != -1){
                c =  (c + 1 + distinct(s,next + 1,memo))% MOD;
            }
        }
    return memo[i] = c;
    }
}