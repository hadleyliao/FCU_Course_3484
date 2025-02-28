/*
雞兔同龍計算機程式，使用者輸入頭、腳分別是多少，程式輸出雞兔各有幾隻。
例如：頭：8，腳26，輸出為：雞:3，兔:5。若無解則輸出:"該數據無解"。

head=c+r=8
feet=2c+4r=26

c=8-r                           r=8-c
2(8-r)+4r=26                    2c+4(8-c)=26
16-2r+4r=26                     2c+32-4c=26
2r=26-16                        -2c=26-32
2r=10                           -c=-3
r=5 帶入以下                      c=3
c+r=8                           r=8-3=5
c=8-5=3                         head=3+5=8 , feet=2*3+4*5=26
head=3+5=8 , feet=2*3+4*5=26
怎樣的情況會無解 => 雞+兔=奇數腳的時候
*/

import java.util.Scanner;
public class Homework_0227_3 {
    public static void main(String[] args) {
        System.out.print("請輸入頭：");
        Scanner sc = new Scanner(System.in);
        int head = sc.nextInt();
        System.out.print("請輸入腳：");
        int feet = sc.nextInt();

        int chicken;
        int rabbit;

        if(feet%2==0){
            rabbit=(feet/2)-head;
            chicken=head-rabbit;
            System.out.println("雞:" + chicken + "，兔:" + rabbit);
        }
        else{
            System.out.println("該數據無解");
        }
    }
}