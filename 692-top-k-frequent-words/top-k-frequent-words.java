class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm = new HashMap<>();  
        for(String word : words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a,b) -> {
                int freq1 = hm.get(a);
                int freq2 = hm.get(b);
                if(freq1 == freq2){
                  return b.compareTo(a);
                }
                return freq1 - freq2;
            }
        );
        for(String word:hm.keySet()){
            pq.add(word);
            if(pq.size() > k){
                pq.poll();
            }
        }

        List<String> res = new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return res;
    }
}