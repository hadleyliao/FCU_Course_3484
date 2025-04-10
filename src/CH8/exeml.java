//90-100 print "A"
//80-89 print "B"
//70-79 print "C"
//60-69 print "D"
//59  print "F"
// Google輸入: java 21 api 可查找官方技術文件 => 試著查找import java.util.Scanner
// Google搜尋: true false table

package CH8;

import java.util.Scanner;

public class exeml {
    public static void main(String[] args) {
//        用 while 迴圈
//        Scanner keyboard = new Scanner(System.in);
//        int score;
//
//        while (true) {  // 讓使用者可以持續輸入直到輸入合法成績為止
//            System.out.print("請輸入學生成績：");
//            score = keyboard.nextInt();
//
//            if (score >= 0 && score <= 100) {
//                // 成績合法，進行分級判斷
//                if (score >= 90) {
//                    System.out.println("A");
//                } else if (score >= 80) {
//                    System.out.println("B");
//                } else if (score >= 70) {
//                    System.out.println("C");
//                } else if (score >= 60) {
//                    System.out.println("D");
//                } else {
//                    System.out.println("F");
//                }
//                break; // 判斷完分級後就跳出迴圈
//            } else {
//                System.out.println("輸入錯誤，請重新輸入 0 到 100 的成績！"); // 提示錯誤並繼續要求重新輸入
//            }
//        }
//        keyboard.close(); // 結束時關閉 Scanner


//     用 do-while 迴圈
//        Scanner keyboard = new Scanner(System.in);
//        int score;
//        do {
//            System.out.print("請輸入學生成績：");
//            score = keyboard.nextInt();
//
//            if (score < 0 || score > 100) {
//                System.out.println("輸入錯誤，請重新輸入 0 到 100 的成績！");
//            }
//        } while (score < 0 || score > 100); // 只要分數不合法就繼續迴圈
//
//        // 到這裡代表輸入合法，開始分級判斷
//        if (score >= 90) {
//            System.out.println("A");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score >= 70) {
//            System.out.println("C");
//        } else if (score >= 60) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }
//        keyboard.close(); // 關閉 Scanner


// 用switch
        System.out.print("請輸入學生成績：");
        Scanner keyboard = new Scanner(System.in);

        boolean valid = false;
        do {
            valid = true;
            int score = keyboard.nextInt();
            if (score < 0 || score > 100) {
                valid = false;
                System.out.println("輸入錯誤，請重新輸入 0 到 100 的成績！");
                continue;
            }
            System.out.println("進入switch cases");
            int level = score / 10;
            switch (level) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("F");
                    break;
                default:
                    valid = false;
                    System.out.println("輸入錯誤，請重新輸入 0 到 100 的成績！");
            }
        } while (!valid);
    }
}