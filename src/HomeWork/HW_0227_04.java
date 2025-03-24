/*
請設計一程式，讓使用者輸入任意整數，程式判斷該數字為奇數或偶數。
例如：輸入：5，輸出：奇數，輸入：6，輸出：偶數。
*/

package HomeWork;

import java.util.Scanner;

public class HW_0227_04 {
    public static void main(String[] args) {
        System.out.print("請輸入任意整數:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 用三元運算解
        // n%2==1 ? 奇數：偶數
        //String result = (n%2==1) ? "奇數" : "偶數";
        //System.out.println(result);
        // 老師說如果不用String的話，可以用什麼帶出字元？？？


        // 用if else解
        if(n%2==0){
            System.out.println("偶數");
        }else{
            System.out.println("奇數");
        }
    }
}