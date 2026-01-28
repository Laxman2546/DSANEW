import java.util.ArrayList;
import java.util.List;

public class Psneze {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        int size = arr.size();
        for(int ar : arr){
            if(ar > 0){
                positive++;
            }else if(ar < 0){
                negative++;
            }else{
                zeroes++;
            }
        }
        double num = (double) (negative /size);
        System.out.println(num);
        System.out.println(negative/size);
        System.out.println(zeroes/size);
    }

}
