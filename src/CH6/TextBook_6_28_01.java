/*
請寫一程式，可計算出 1 到 100 間所有 3 的倍數之總和
*/

package CH6;

public class TextBook_6_28_01 {
    public static void main(String[] args) {
        int sum = 0, range = 100;
        for(int i=3; i<=range; i+=3){ // i設定為3的倍數之最小起始值
            sum += i;
        }
        System.out.println("1 到 100 間所有 3 的倍數之總和為" + sum);
    }
}