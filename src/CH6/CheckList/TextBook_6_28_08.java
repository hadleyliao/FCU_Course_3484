/*
試寫一程式，讓使用者輸入兩次密碼(四位數字)，並驗證使用者兩次輸入的密碼是否相同，輸入三次不正確即顯示錯誤的訊息
*/

package CH6.CheckList;
import java.util.Scanner;
public class TextBook_6_28_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        final int maxAttempts = 3;

        while (attempts < maxAttempts) {
            System.out.print("請輸入四位數字密碼: ");
            String password1 = scanner.next();

            // 檢查密碼是否是四位數字
            if (password1.length() != 4 || !password1.matches("\\d{4}")) {
                System.out.println("錯誤！請輸入四位數字密碼。");
                attempts++;
                continue;
            }

            System.out.print("請再次輸入密碼: ");
            String password2 = scanner.next();

            // 檢查第二次輸入的密碼是否是四位數字
            if (password2.length() != 4 || !password2.matches("\\d{4}")) {
                System.out.println("錯誤！請輸入四位數字密碼。");
                attempts++;
                continue;
            }

            // 比較兩次輸入的密碼是否相同
            if (password1.equals(password2)) {
                System.out.println("密碼驗證成功！");
                break;
            } else {
                System.out.println("密碼不一致，請再試一次。");
                attempts++;
            }

            // 如果已經輸入錯誤達三次，則顯示錯誤訊息並結束程式
            if (attempts == maxAttempts) {
                System.out.println("錯誤！您已經輸入錯誤三次，程式結束。");
            }
        }

        scanner.close();
    }
}