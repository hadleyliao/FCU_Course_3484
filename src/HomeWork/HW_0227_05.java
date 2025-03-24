/*
請設計出一程式，從使用者得到一大於0的整數數字n，輸出1+2+3+...+n之結果，例如：輸入：5，輸出：15
*/

package HomeWork;

import java.util.Scanner;

public class HW_0227_05 {
    public static void main(String[] args) {
        System.out.print("請輸入大於0的整數:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>0){
            int sum=n*(n+1)/2;
            System.out.println(sum);
        }else{
            System.out.println("數字無效，請重新輸入");
        }
    }
}