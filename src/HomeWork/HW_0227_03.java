/*
雞兔同龍計算機程式，使用者輸入頭、腳分別是多少，程式輸出雞兔各有幾隻。
例如：頭：8，腳26，輸出為：雞:3，兔:5。若無解則輸出:"該數據無解"。

head=c+r=8
feet=2c+4r=26

怎樣的情況會無解 => 雞+兔=奇數腳的時候
*/

package HomeWork;

import java.util.Scanner;

public class HW_0227_03 {
    public static void main(String[] args) {
        System.out.print("請輸入頭：");
        Scanner sc = new Scanner(System.in);
        int head = sc.nextInt();
        System.out.print("請輸入腳：");
        int feet = sc.nextInt();

        int chicken;
        int rabbit;

        if (head <= 0) {
            System.out.println("該數據無解");
        } else {
            if (feet % 2 == 0 & feet!=0 & feet>0 ) {
                rabbit = (feet / 2) - head;
                chicken = head - rabbit;
                System.out.println("雞:" + chicken + "，兔:" + rabbit);
            } else if(feet <= 0){
                System.out.println("該數據無解");
            }
        }
    }
}