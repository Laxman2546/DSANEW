import java.util.*;

public class ExclusiveTime {
        public static int[] exclusiveTime(int n, List<String> logs) {
            int[] arr = new int[n];
            Stack<Integer>sk = new Stack<>();
            int previousTime = 0;

            for(String newLogs : logs){
                String[] parts = newLogs.split(":");
                int funId =  Integer.parseInt(parts[0]);
                int time = Integer.parseInt(parts[2]);
                String type = parts[1];
                if(Objects.equals(type, "start")){
                    if(!sk.isEmpty()){
                    arr[sk.peek()] += time - previousTime;
                    }
                        sk.push(funId);
                        previousTime = time;

                }else {
                    int finshedFun = sk.pop();
                    arr[finshedFun] += time - previousTime + 1;
                    previousTime= time+1;
                }
            }
            return arr;
        }
    public static void main(String[] args) {
        List<String> logs = new ArrayList<>();
        logs.add("0:start:0");
        logs.add("1:start:2");
        logs.add("1:end:5");
        logs.add("0:end:6");
        int n = 2;
       int[] result =  exclusiveTime(n,logs);
       System.out.println(Arrays.toString(result));
    }
}
