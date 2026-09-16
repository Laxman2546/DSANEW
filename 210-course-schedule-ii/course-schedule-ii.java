class Solution {
    private List<Integer> topo(List<List<Integer>> pre,int[] inDegree){
        Queue<Integer> qu = new LinkedList<>(); 
        List<Integer> resultList = new ArrayList<>();
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i] == 0){
                qu.offer(i);
                resultList.add(i);
            }
        }
        while(!qu.isEmpty()){
            int node = qu.poll();
            for(int k = 0;k<pre.get(node).size();k++){
                int course = pre.get(node).get(k);
                inDegree[course]--;
                if(inDegree[course] == 0){
                    qu.offer(course);
                    resultList.add(course);
                };

            }
        }
        return resultList;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> pre = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            pre.add(new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];
        for(int[] prere : prerequisites){
            int course = prere[0];
            int prereq = prere[1];
            pre.get(prereq).add(course);
            inDegree[course]++;
        }
        List<Integer> res = topo(pre,inDegree);
        if(res.size() != numCourses) return new int[0];
        int[] orders = new int[res.size()];
        for(int order = 0;order < orders.length;order++){
            orders[order] = res.get(order);
        }
        return orders;
    }
}