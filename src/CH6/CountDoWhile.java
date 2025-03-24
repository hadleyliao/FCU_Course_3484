// 用 do/while 測試迴圈執行次數

package CH6;

public class CountDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("這是第" + i + "次執行迴圈");
        } while (i ++ < 3);
    }
}

/*
這是第0次執行迴圈
這是第1次執行迴圈
這是第2次執行迴圈
這是第3次執行迴圈

第5行i = 0一往下到第6行就進入到do裡了，所以到第7行{}打印時，就是從第0次
*/