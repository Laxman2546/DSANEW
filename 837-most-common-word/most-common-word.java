class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String para = paragraph.toLowerCase().replaceAll("\\p{Punct}"," ");
        HashMap<String,Integer> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        String[] words = para.split("\\s+"); 
        for(String word : words){
            hm.put(word,hm.getOrDefault(word,0)+1);
            System.out.println(word);
        }
        for(String ban : banned){
            hs.add(ban);
        }
        String res = "";
        int maxFreq = 0;
        for(String word :words){
            if(!hs.contains(word) && hm.get(word) > maxFreq){
                maxFreq = hm.get(word);
                res = word;
            }
        }
        return res;
    }
}