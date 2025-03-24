package CH5;

import java.util.Scanner;

public class CheckOilThree {
    public static void main(String[] args) {
        System.out.print("請輸入目前所剩油量（單位：公升）：");
        Scanner sc = new Scanner(System.in);
        int liter = sc.nextInt();

        if ((liter >= 2) & (liter < 5)) {
            System.out.println("油量尚足，提醒您注意油表。");
        }
        System.out.println("祝您行車愉快。");
    }
}

// 試試看把條件的＆換成其他｜｜