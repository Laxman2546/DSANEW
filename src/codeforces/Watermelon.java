package codeforces;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String status = checkisDivide(n);
        System.out.println(status);
    }

    private static String checkisDivide(int n) {
        if(n%2 == 0){
            return  "YES";
        }
        return "NO";
    }
}
