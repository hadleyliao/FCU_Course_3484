package CH5;

import java.util.Scanner;

public class CheckOilElseIf {
    public static void main(String[] args) {
        System.out.print("請輸入目前所剩油量（單位：公升）：");
        Scanner sc = new Scanner(System.in);
        int liter = sc.nextInt();

        if (liter < 2) {
            System.out.println("油量已經不足，該去加油了！");
        }
        else if (liter < 10) {
            System.out.println("油量尚足，提醒您注意油表。");
        }
        else if (liter >= 10){
            System.out.println("油量充足，請安心上路");
        }
    }
}

// 試試看把else拿掉全數都用if
// if...else if...else if...是一組的，只要有一個成立只跑這個，其他都不會做
// 三個if都是獨立的，所以每一行都會去跑