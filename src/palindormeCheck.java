public class palindormeCheck {
    public static boolean isPalindrome(String name){
        int left =0;
        int right = name.length()-1;
        while(left <= right){
            if(name.charAt(left) == name.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
            return true;
    }
    static void main(String[] args) {
        String name = "mom";
       boolean isTrue =  isPalindrome(name);
        System.out.println(isTrue);
    }
}
