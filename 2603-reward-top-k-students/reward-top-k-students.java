class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        List<Integer> res = new ArrayList();
        HashSet<String> pos = new HashSet<>();
        HashSet<String> neg = new HashSet<>();
         for(String positive :positive_feedback){
                pos.add(positive);
        }
        for(String negative : negative_feedback){
            neg.add(negative);
        }
            PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a, b) -> a[0] == b[0]
            ? Integer.compare(b[1], a[1])
            : Integer.compare(a[0], b[0])
    );
        for(int i=0;i<report.length;i++){
            int count = 0;
            String[] sentence = report[i].split("\\s+");
            for(String word : sentence){
                if(pos.contains(word))count += 3;
                if(neg.contains(word))count -= 1;
            }
            pq.add(new int[]{count, student_id[i]});
            while(pq.size() > k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            int[] polled = pq.poll();
            res.add(polled[1]);
        }
        Collections.reverse(res);
    return res;
    }
}