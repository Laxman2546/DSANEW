class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        for(int i=0;i<s.length();i++){
           int calc = Math.abs(s.charAt(i)-'z')+ 1;
           total += calc * (i+1);

        }
        return total;
    }
}