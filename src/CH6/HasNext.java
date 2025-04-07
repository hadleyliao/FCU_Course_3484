package CH6;

import java.util.*;

public class HasNext {
    public static void main(String[] args) {
        // 宣告累加值sum，計算範圍range，迴圈變數i
        int sum = 0, range, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入欲計算得奇數和範圍（結尾數值）");

        while (!sc.hasNextInt()){   // 輸入非正數，就執行迴圈
            System.out.print("請輸入整數：");
            sc.next();              // 清除第12行的內容
        }

        range =  sc.nextInt();      //  讀取整數值

        // 由1開始，每次加2直到i值大於range的for迴圈
        for(i=1; i<=range; i+=2){
            sum += i;
        }
        System.out.println("1到 "+ range +" 的所有奇數和為" +sum);
    }
}

/*
請輸入欲計算得奇數和範圍（結尾數值）5
1到 5 的所有奇數和為9
*/