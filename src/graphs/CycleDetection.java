package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Parent{
    int current;
    int parent;
    public Parent(int current,int parent){
        this.current = current;
        this.parent = parent;
    }
}
public class CycleDetection {
    public static void main(String[] args) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<6;i++){
            ls.add(new ArrayList<>());
        }
        ls.get(0).add(1);
        ls.get(1).add(0);
        ls.get(1).add(2);
        ls.get(2).add(1);
        ls.get(2).add(3);
        ls.get(2).add(4);
        ls.get(3).add(2);
        ls.get(3).add(5);
        ls.get(3).add(4);
        ls.get(4).add(2);
        ls.get(4).add(3);
        ls.get(5).add(3);
        System.out.println(ls);
        boolean[]  vis  = new boolean[ls.size()];
        for(int i=0;i<ls.size();i++){
            if(!vis[i]){
                if(isCycle(ls,vis,i)){
                    System.out.println(true);
                };
            }
        }
    }
    private static boolean isCycle(List<List<Integer>> ls,boolean[] vis,int i) {
        Queue<Parent> qu = new LinkedList<>();
        qu.add(new Parent(i,-1));
        vis[i] = true;
        while(!qu.isEmpty()){
             Parent val = qu.poll();
             int curr = val.current;
             int par = val.parent;
             for(int num : ls.get(curr)){
                 if(!vis[num]){
                     vis[num] = true;
                     qu.add(new Parent(num,curr));
                 }else if(num != par){
                     return true;
                 }
             }
        }
        return false;
    }
}
