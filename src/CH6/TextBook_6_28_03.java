/*
試寫一程式，讓使用者輸入兩個整數，並計算兩整數間所有整數的合
*/

package CH6;

import java.util.Scanner;

public class TextBook_6_28_03 {
    public static void main(String[] args) {
        System.out.print("請輸入第一個整數：");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("請輸入第二個整數：");
        int num2 = sc.nextInt();

        // 確保 num1 是較小的數，若不是則交換
        if (num1 > num2) {
            int temp = num1; // 宣告新變數，先把使用者原本輸入的 num1 放入 temp 中
            num1 = num2; // 讓原本的 num2 賦值給 num1
            num2 = temp; // 讓新變數 temp 賦值給 num2
        }

        int sum = 0;
        for (int i = num1; i <= num2; i++){
            sum += i;
        }
        System.out.println(num1 + " 到 " + num2 + " 之間所有整數的總和為：" + sum);
    }
}
