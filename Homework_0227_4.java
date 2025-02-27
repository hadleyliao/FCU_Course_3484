/*
請設計一程式，讓使用者輸入任意整數，程式判斷該數字為奇數或偶數。
例如：輸入：5，輸出：奇數，輸入：6，輸出：偶數。
*/


import java.util.Scanner;
public class Homework_0227_4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // 三元運算
        // n%2==1 ? 奇數：偶數
        String result = (n%2==1) ? "奇數" : "偶數";
        System.out.println(result);



        // if else
        /*
        if(n%2==0){
            System.out.println("偶數");
        }else{
            System.out.println("奇數");
        }
        */
    }
}