import java.util.Stack;

public class MountainArray {
    public static boolean checkMountain(int[] arr){

        Stack<Integer> sk = new Stack<>();
        for(int i= 0; i<arr.length;i++){
            if(!sk.isEmpty() && arr[sk.peek()] == arr[i]){
                return  false;
            }
            while(!sk.isEmpty() && arr[sk.peek()] > arr[i]){
                sk.pop();
            }
            sk.push(i);
        }

        return  true;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,5,3,2,1};
        boolean isMountain = checkMountain(arr);
        System.out.println(isMountain);
    }
}
