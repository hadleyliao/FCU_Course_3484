// 將BubbleSort此程式修改為數字由使用者輸入任意數量的字，進行排序後，輸出最後的排序結果

package CH7;
import java.util.Scanner;
public class BubbleSort2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入要排序的整數數量：");
        int n = scanner.nextInt();

        int[] data = new int[n];

        // 輸入數字
        System.out.println("請輸入 " + n + " 個整數：");
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        // 泡沫排序
        int temp;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        // 輸出排序後結果
        System.out.println("排序後結果：");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println(); // 換行
    }
}

/*
請輸入要排序的整數數量：3
請輸入 3 個整數：
99 6 77
排序後結果：
6 77 99
*/