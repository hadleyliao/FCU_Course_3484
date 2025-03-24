// 使用 continue 來跳到下一輪迴圈
// 以下用 CountOdd 這支程式碼改用 continue 設計

package CH6;

import java.util.Scanner;

public class UseContinue {
    public static void main(String[] args) {
        System.out.print("請輸入欲計算的奇數和範圍（即結尾數值）：");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int sum = 0;    // 宣告sum變數並初始化為0，用來累加奇數的總和

        // for(初始運算式宣告int i=1；條件運算式i <= 使用者輸入的range；控制運算式每次到這個for迴圈起始值i都要+1)
        for(int i = 1 ; i <= range ; i ++){     // i是用來計算奇數和的起始點，初始值是1。
            if(i % 2 == 0) continue;    // 這行判斷當前的i是否為偶數，若i除2餘數等於0代表它是偶數，則跳過這一輪，直接進入下一輪，即回到第15行重跑
            sum += i;               // 若i是奇數才會跑到這行與sum累加，即 sum = sum + i
        }
        System.out.println("1 到 "+range+" 的所有奇數和為 "+sum );
    }
}

/*
請輸入欲計算的奇數和範圍（即結尾數值）：199
1 到 199 的所有奇數和為 10000

這段程式的目的是利用第16行的 continue 關鍵字來跳過偶數，並且累加所有奇數的總和。
*/