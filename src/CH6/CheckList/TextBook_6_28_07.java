/*
試寫一程式，可以繪出如下的菱形
    *
   ***
  *****
 *******
  *****
   ***
    *
*/

package CH6.CheckList;

public class TextBook_6_28_07 {
    public static void main(String[] args) {
        int n = 4;  // n是半個菱形的高度（上半部分的高度），整體的寬度是 2*n - 1

        // 繪製上半部分
        for (int i = 1; i <= n; i++) {
            // 印空白
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // 印星號
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 繪製下半部分
        for (int i = n - 1; i >= 1; i--) {
            // 印空白
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // 印星號
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

    *
   ***
  *****
 *******
  *****
   ***
    *

*/