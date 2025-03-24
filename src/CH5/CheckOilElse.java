package CH5;

import java.util.Scanner;

public class CheckOilElse {
    public static void main(String[] args) {
        System.out.print("請輸入目前所剩油量（單位：公升）：");
        Scanner sc = new Scanner(System.in);
        int liter = sc.nextInt();

        if (liter < 2) {
            System.out.println("油量已經不足，該去加油了！");
        } else if (liter < 10) {
            System.out.println("油量尚足，提醒您注意油表。");
        } else {
            System.out.println("油量充足，請安心上路");
        }
    }
}