// 計算使用者輸入數字的階乘值

package CH6;

import java.io.*;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("請輸入 1-170 間的整數來計算階乘");
            System.out.print("(輸入 0 即結束程式):");
            String str = br.readLine();
            int num = Integer.parseInt(str);
            if (num == 0)
                break;
            else if (num > 170)
                continue;

            System.out.println(num + "! 等於");

            double fact;
            for(fact = 1; num > 0; num --)
                fact *= num;

            System.out.print(fact + "\n\n");
        }
    }
}
