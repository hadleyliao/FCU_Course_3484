package Ch6;
// 用 while 測試迴圈執行次數
public class CountWhile{
    public static void main(String args[]){
        int i=0;
        while (i++<3){
            System.out.println("這是第" +i+ "次執行迴圈");
        }
    }
}

/*
這是第1次執行迴圈
這是第2次執行迴圈
這是第3次執行迴圈

第5行一往下到第6行就被+1了，所以進到{}打印時就是從第1次而非第0次
*/
