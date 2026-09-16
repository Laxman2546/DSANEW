class Solution {
    private boolean topo(int[] inDegree,List<List<Integer>> pre,boolean[] vis){
        Queue <Integer> qu = new LinkedList<>();
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i] == 0){
                qu.offer(i);
            }
        }
        while(!qu.isEmpty()){
            int val = qu.poll();
            for(int k=0;k< pre.get(val).size();k++){
                int node = pre.get(val).get(k);
                inDegree[node]--;
                if(inDegree[node] == 0)qu.offer(node); 
            }
        } 
        for(int node : inDegree){
            if(node != 0)return false;
        }
        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> pre = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            pre.add(new ArrayList());
        }
        int[] inDegree = new int[numCourses];
        for(int[] preRe : prerequisites){
            int u = preRe[0];
            int v =  preRe[1];
            pre.get(v).add(u);
            inDegree[u]++;
        }
    
        boolean vis[] = new boolean[numCourses];
        return topo(inDegree,pre,vis);
    }

}