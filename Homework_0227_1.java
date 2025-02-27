/*
假設某個自動售票機只能接受10元、5元、及1元的硬幣．請設計一程式，當使用者輸入一小於999的正整數數字時，
他所需投入各種幣值硬幣最少的數量分別是多少？若數字大於999則顯示：輸入過大。例如使用者輸入123，則程式顯示：10元12個，5元0個，1元3個。

x<999
x>999 => 提示報錯訊息
123/10=12...3 => 12個10元 => 商 =>/
                 0個5元
                 3個1元   => 餘數 =>%


128/10=12...8
8/5=1...3
3/1=3...0
*/


import java.util.Scanner;

public class Homework_0227_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        if(x<999){
            int result1 = x/10 ;
            int result2 = x%10 ;

            System.out.print("10元=" + "個" +"5元=" + "個" + "1元=" + "個");
        }else{
            System.out.print("輸入過大");
        }
    }
}