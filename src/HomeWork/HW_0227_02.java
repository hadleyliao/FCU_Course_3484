/*
請撰寫一程式，計算出輸入之整數除以13的商數與餘數，
例如：輸入26，輸出：商數=2，餘數=0

26/13=2...0 => 商=2，餘數=0
quotient=商數
remainder=餘數
*/

package HomeWork;

import java.util.Scanner;

public class HW_0227_02 {
    public static void main(String[] args) {
        System.out.print("請輸入一個整數：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int quotient = n/13;    // /是只取商
        int remainder = n%13;   // %是只取餘數
        System.out.println("商數=" + quotient + "，餘數=" + remainder);
    }
}
