import java.util.ArrayDeque;
import java.util.Deque;

//bruteforce
public class TimeRequired {
    public static int timeRequiredToBuyBrute(int[] tickets, int k) {
        int seconds = 0;
        if(tickets.length ==0){
            return 0;
        }
        int  i=0;
        while(tickets[k] !=0){
            if( i< tickets.length && tickets[i]>0){
                tickets[i]= tickets[i]-1;
                seconds++;
                i++;
            if(i== tickets.length-1){
                i=0;
            }
            }else if(tickets[k] ==0){
               return seconds;
            }
        }

        return seconds;
    }
//optimized
    public static  int  timeRequiredToBuy(int[]tickets, int k){
        int seconds = 0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                seconds += Math.min(tickets[k],tickets[i]);
            }else {
                seconds += Math.min(tickets[i],tickets[k]-1);
            }
        }
        return seconds;
    }
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1,1};
        int k = 3;
        int ans = timeRequiredToBuy(tickets,k);
        System.out.println(ans);
    }
}
