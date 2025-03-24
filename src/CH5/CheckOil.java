package CH5;

import java.util.*;

public class CheckOil {
    public static void main(String[] args) {
        System.out.print("請輸入目前所剩油量（單位：公升）：");
        Scanner sc = new Scanner(System.in);
        int liter = sc.nextInt();

        if (liter < 2) // 這裡沒有{} [註1]
            System.out.println("油量已經不足，已經該加油了！");
        System.out.println("祝您行車愉快。");
    }
}


/*
  [註1] 這個if()沒有{}，
*/