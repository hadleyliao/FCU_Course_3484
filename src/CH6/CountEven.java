// 利用 while 迴圈計算某範圍內的偶數和

package CH6;

import java.io.*;

public class CountEven {
    public static void main(String[] args)throws IOException {

        int sum = 0, range;
        System.out.print("請輸入欲計算的偶數和範圍（即結尾數值）：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        range = Integer.parseInt(str);

        int i=0;
        while (i<=range){
            sum += i;
            i+=2;
        }
        System.out.println("1 到 "+range+" 的所有偶數和為"+sum);
    }
}

/*
請輸入欲計算的偶數和範圍（即結尾數值）：2020
1 到 2020 的所有偶數和為1021110
*/