import java.util.Arrays;

interface sorting{
    void sortNumbers(int[] arr);
}
class BubbleSort implements  sorting{
    @Override
    public void sortNumbers(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
    }
}
class SelectionSort implements  sorting{
    public void sortNumbers(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
           for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
           }
           if(smallest != i){
           arr[i] = arr[i] ^ arr[smallest];
           arr[smallest] = arr[i] ^ arr[smallest];
           arr[i] = arr[i] ^ arr[smallest];
           }
        }
    }
}
public class Bubblesort {
    public static void main(String[] args) {
        //bubble sort
            int[] arr ={5,3,4,2,1};
//             new BubbleSort().sortNumbers(arr);
                new SelectionSort().sortNumbers(arr);
            System.out.println(Arrays.toString(arr));
    }
}
