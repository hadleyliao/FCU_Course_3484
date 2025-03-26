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
        int n = 7; // 菱形的最大寬度（必須是奇數）
        int mid = n / 2; // 計算中間行的位置

        // 上半部（包含中間最大行）
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" "); // 印出前導空格
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*"); // 印出星號
            }
            System.out.println(); // 換行
        }

        // 下半部
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" "); // 印出前導空格
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*"); // 印出星號
            }
            System.out.println(); // 換行
        }
    }
}