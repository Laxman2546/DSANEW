import java.util.*;

class Pair{
    int value;
    int idx;
    Pair(int value,int idx){
        this.value = value;
        this.idx = idx;
    }
}
public class Cityproblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int employees = sc.nextInt();
        sc.nextLine();
        int[] cityA = new int[n];
        int[] cityB = new int[n];
        for(int i=0;i<cityA.length;i++){
            cityA[i] = sc.nextInt();
        }
        for(int j=0;j<cityB.length;j++){
            cityB[j] = sc.nextInt();
        }
        System.out.println(calculateMin(employees,cityA,cityB));
    }


    private static int calculateMin(int employees, int[] cityA, int[] cityB) {
        int minCost =  0;
        int n = cityA.length;
        int[] costB = new int[n];
        for(int i=0;i<costB.length;i++){
            costB[i] = Math.min(cityA[i],cityB[i])+cityB[i];
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2)->Integer.compare(p2.value,p1.value));
        for(int i=0;i<costB.length;i++){
            if(pq.size() < employees) {
             pq.add(new Pair(costB[i],i));
            }else if(!pq.isEmpty() && pq.peek().value > costB[i]){
                pq.poll();
                pq.add(new Pair(costB[i],i));
            }
        }
        HashSet<Integer> hs = new HashSet<>();
        while(!pq.isEmpty()){
            Pair popped =  pq.poll();
            minCost += popped.value;
            hs.add(popped.idx);
        }
        int aCost = 0;
        for(int i=0;i<cityA.length;i++){
               if(!hs.contains(i)){
                   aCost+= cityA[i];
               }
        }

        return  minCost+aCost;
    }
    private static  int calculatMin2(int emp,int[] cityA,int[] cityB){
        int n = cityB.length;
        int[] costB = new int[n];
        for(int i=0;i<cityB.length;i++){

        }
        return 0;
    }
}
