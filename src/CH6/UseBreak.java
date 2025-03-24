// 使用 break 跳出無窮迴圈

package CH6;

public class UseBreak {
    public static void main(String[] args) {
        int i=1;
        while(i>0){     // 無窮回圈
            System.out.println("無窮迴圈執行中．．．");
            if(i==5)    // 當i=5時，條件運算是成立
                break;  // 跳出回圈
            i++;
        }
        System.out.println("成功到跳出回圈！");
    }
}

/*
無窮迴圈執行中．．．
無窮迴圈執行中．．．
無窮迴圈執行中．．．
無窮迴圈執行中．．．
無窮迴圈執行中．．．
---------------------> 上述訊息僅出現5次，表示迴圈只執行了5次
成功到跳出回圈！
*/