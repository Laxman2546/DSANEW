public class Gasstation {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(gasStation(nums,cost));
    }

    private static int gasStation(int[] gas, int[] cost) {
        int maxGas = 0;
        int maxCost = 0;
        if(gas.length != cost.length)return -1;
        for(int i=0;i<gas.length;i++){
            maxGas += gas[i];
            maxCost += cost[i];
        }
        if(maxGas  <  maxCost)return -1;
        int currentGas = 0,startIdx = 0;
        for(int i=0;i<gas.length;i++){
            currentGas += gas[i] - cost[i];
            if(currentGas < 0){
                startIdx = i+1;
                currentGas = 0;
            }
        }
        return startIdx;
    }
}
