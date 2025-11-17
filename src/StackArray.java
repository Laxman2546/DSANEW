import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class StackArray {
    public static List<String> StackOp(int[] arr,int n){
        Stack stack = new Stack();
        List  stackData = new ArrayList();
        HashSet hs = new HashSet();
        for(int num:arr){
            hs.add(num);
        }
        for(int i=1;i<=n;i++){
            if(hs.contains(i)){
                stack.push(i);
                stackData.add("Push");
            }else if(i < arr[arr.length-1]){
                stack.push(i);
                stackData.add("Push");
                stack.pop();
                stackData.add("Pop");
            }
        }
        return stackData;
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        int n = 3;
        List<String> name = StackOp(arr,n);
        System.out.println(name);
    }
}
