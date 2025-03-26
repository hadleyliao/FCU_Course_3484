// 計算在某範圍內的所有其數和

package CH6;

import java.util.Scanner;

public class CountOdd {
    public static void main(String[] args) {
        System.out.print("請輸入欲計算的奇數和範圍（即結尾數值）：");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int sum = 0;
        // for(初始運算式宣告int i=1；條件運算式i <= 使用者輸入的range；控制運算式每跑一次for迴圈i都要+2)
        for(int i = 1 ; i <= range ; i += 2){
            sum += i;   // 即sum=sum+i
        }
        System.out.println("1 到 "+range+" 的所有奇數和為 "+sum );
    }
}

/*
請輸入欲計算的奇數和範圍（即結尾數值）：15
1 到 15 的所有奇數和為 64

請輸入欲計算的奇數和範圍（即結尾數值）：1000
1 到 1000 的所有奇數和為 250000
*/