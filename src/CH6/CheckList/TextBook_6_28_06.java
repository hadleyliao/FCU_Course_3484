/*
試寫一程式，可讓使用者輸入矩形長寬，並於螢幕上輸出如下的星號 * 所組成的矩形，例如輸入 5 和 3 時會輸出:
*****
*****
*****
*/

package CH6.CheckList;

import java.util.Scanner;

public class TextBook_6_28_06 {
    public static void main(String[] args) {
        System.out.print("輸入矩形的長（每行有幾個*）:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.print("輸入矩形的寬（有幾行）:");
        int width = sc.nextInt();

        for(int i = 0 ; i < width ; i++){   // 外層迴圈：控制「有幾行」，即（width）
            for(int j = 0 ; j < length ; j++){   // 內層迴圈：控制「每行有幾個*」，即（length）
                System.out.print("*");
            }
            System.out.println();   // 換行
        }
    }
}