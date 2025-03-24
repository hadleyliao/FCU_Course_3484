package CourseWork;

import java.util.Scanner;

public class CW_0304 {
    public static void main(String[] args) {
        System.out.print("輸入學生成績：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score>=0 & score<=100){
            if(score>=90 & score <= 100){
                System.out.println("A");
            } else if (score >=80 & score <= 89) {
                System.out.println("B");
            } else if (score >=70 & score <= 79) {
                System.out.println("C");
            } else if (score >=60 & score <= 69) {
                System.out.println("D");
            } else {
                System.out.println("不及格");
            }
        }else{
            System.out.println("輸入錯誤");
        }
        /* 以下老師改過的極簡 code
        if(score>=0 & score<=100){
            if(score>=90 & score <= 100){
                System.out.println("A");
            } else if (score >=80) {
                System.out.println("B");
            } else if (score >=70) {
                System.out.println("C");
            } else if (score >=60) {
                System.out.println("D");
            } else {
                System.out.println("不及格");
            }
        }else{
            System.out.println("輸入錯誤");
        }
        */
    }
}