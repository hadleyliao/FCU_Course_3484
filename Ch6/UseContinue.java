package Ch6;
// 使用 continue 來跳到下一輪迴圈
// 以下用 CountOdd 這支程式碼改用 continue 設計
import java.util.Scanner;

public class UseContinue {
    public static void main(String[] args) {
        System.out.print("請輸入欲計算的奇數和範圍（即結尾數值）：");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int sum=0;
        for(int i =1 ; i<=range ; i++){
            if(i%2==0) continue;    // 若是偶數就跳到下一輪迴圈
            sum += i;               // 奇數才會被累加
        }
        System.out.println("1 到 "+range+" 的所有奇數和為 "+sum );
    }
}

/*
請輸入欲計算的奇數和範圍（即結尾數值）：199
1 到 199 的所有奇數和為 10000
*/