class Solution {
    public int[] validSequence(String word1, String word2) {
     int n = word1.length();
     int m = word2.length();
     int[] rightMatched = new int[n];
     int i = n-1;
     int j = m-1;
     int count = 0;
     while(i >= 0){
        if(j >= 0  && word1.charAt(i) == word2.charAt(j)){
            count++;
            j--;
        }
        rightMatched[i] = count;
        i--;
     }   
     i = 0;
     j = 0;
     int k = 0;
     boolean changePower = true;
     int[] res = new int[m];
     while(i < n && j < m){
        if(word1.charAt(i) == word2.charAt(j)){
            res[k++] = i;
            j++;
        }else if(changePower && i+1 < n && rightMatched[i+1] >= m-j-1){
            res[k++] = i;
            j++;
            changePower = false;
        }
        i++;
     }
     return j == m ? res : new int[0];
    }
}