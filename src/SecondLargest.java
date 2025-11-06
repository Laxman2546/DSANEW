public class SecondLargest {
    public static  int findSecondLargest(int[] arr){
        if(arr.length==1 || arr.length==0){
            return -1;
        }
        int secondL = -1;
        int largest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                secondL = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondL){
                secondL = arr[i];
            }
        }
    return secondL;
    }


    static void main(String[] args) {
        int arr[] = {55,1};
       int secondLargestNum =  findSecondLargest(arr);
        System.out.println(secondLargestNum + "iam secondLargest");
    }
}
