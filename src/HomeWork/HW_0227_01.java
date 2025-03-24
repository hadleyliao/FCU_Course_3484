/*
假設某個自動售票機只能接受10元、5元、及1元的硬幣．請設計一程式，當使用者輸入一小於999的正整數數字時，
他所需投入各種幣值硬幣最少的數量分別是多少？若數字大於999則顯示：輸入過大。例如使用者輸入123，則程式顯示：10元12個，5元0個，1元3個。

x<999
x>999 => 提示報錯
123/10=12...3 => 商=12(10元) => 拿餘數往下除
3/5=0...3     => 商=0(5元) => 拿餘數往下除
3/1=3...0     => 商=3(1元)
*/

package HomeWork;

import java.util.Scanner;

public class HW_0227_01 {
    public static void main(String[] args) {
        System.out.print("請輸入一個小於999的正整數：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<999){
            int result1 = x/10 ;    // 只取商(10元有幾個)
            // int result2 = x%10 ;    // 取餘數往下運算 => 這行沒用到
            int result3 = x%10/5;   // 只取商(5元有幾個)
            // int result4 = x%10%5;   // 取餘數往下運算 => 這行沒用到
            int result5 = x%10%5/1; // 只取商(1元有幾個)
            System.out.print("10元=" + result1 + "個" + "，5元=" +result3 + "個" + "，1元=" + result5 + "個");
        }else{
            System.out.print("輸入過大");
        }
    }
}