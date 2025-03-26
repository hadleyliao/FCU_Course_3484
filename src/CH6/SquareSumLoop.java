// 以迴圈累加 1-10 的和平方

package CH6;

public class SquareSumLoop {
    public static void main(String[] args) {
        int sum = 0;    // 儲存1-10平方和的sum
        for (int i = 1; i <= 10; i++) {     // for(初始運算式;條件運算式;控制運算式)
            sum += i * i; // 等同於sum = sum + (i * i); 注意：每次sum都是用最新結果的值，並非初始值。
            System.out.println("1-" + i + "的平方何為：" + sum);
        }
    }
}



/*
    for 迴圈執行順序 ➔ ① 初始運算式 ➔ ② 條件運算式 true/false來判斷 ➔ 下來做把{}裡的做完 ➔  再上去到 ③ 控制運算式

    1-1的平方何為：1
    1-2的平方何為：5
    1-3的平方何為：14
    1-4的平方何為：30
    1-5的平方何為：55
    1-6的平方何為：91
    1-7的平方何為：140
    1-8的平方何為：204
    1-9的平方何為：285
    1-10的平方何為：385

    += 是加法賦值運算符，它的作用是將右邊的數值與左邊的變數相加，並將結果“重新賦值”給左邊的變數中。

    variable += value;
    等同於
    variable = variable + value;

    int X = 5;
    X += 2;  // 等於右＋左並將結果“重新賦值”給左。等同於 X = X + 2;
    System.out.println(X);  // 輸出：7

    int sum = 10;
    sum += 5;  // 等於右＋左並將結果“重新賦值”給左。等同於 sum = sum + 5;
    System.out.println(sum);  // 輸出：15
*/