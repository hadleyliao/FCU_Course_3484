package CH6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("請輸入要檢查的數（輸入 0 結束）");
            String str = br.readLine();
            int num = Integer.parseInt(str);
            if (num == 0) break; // 若輸入0則跳出迴圈，結束程式

            boolean isPrime = true;     // 表示數值是否為植樹的布林值
            double range = num / 2.0;   // 限定除數的範圍

            for (int i = 2; i <= range; i++) { // 整數做除法運算的for迴圈，目的是為了找出每一個除數(因數)
                if ((num % i) == 0) {          // 餘數為0表示可以整除，非質數
                    if (isPrime == true) {
                        isPrime = false;       // 非質數，並輸出目前的除數(因數)
                        System.out.print(num + "不是質數，可被" + i);
                    } else {                   // 輸出目前的除數(因數)
                        System.out.print("、" + i);
                    }
                }
            }
            // 檢查完畢，依檢查結果輸出不同訊息
            if (isPrime) {  // 若是質數，即輸出該數值
                System.out.println(num + "是質數");
            } else {
                System.out.println("整除"); // 把上面for迴圈裡，整數做除法運算找除數(因數)的輸出加上"整除"
            }
        }
    }
}