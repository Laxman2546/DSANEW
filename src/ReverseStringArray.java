import java.util.Arrays;

public class ReverseStringArray {
    public  static void reverseInplace(char[] ch){
        int right = ch.length-1;
        int left = 0;
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] ch = {'d','a','r','l','i','n','g'};
        reverseInplace(ch);
        System.out.println(Arrays.toString(ch));
    }

}
