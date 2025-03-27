package CH6.CheckList;

public class Ex8 {
    public static void main(String[] args) {
        int i , sum = 0;
        for(i=2; i<9; i++){
            if((i%2) == 0){ // 檢查 i 是否為偶數
                sum = sum + i;
                System.out.print(sum);
            }
            else continue; // 如果是奇數，執行 continue，跳過當次迴圈剩下的部分
        }
    }
}


/*
輸出 261220

其實邏輯應該是分別輸出2、6、12、20
只是第9行是print無換行，而非println換行。所以所有數字都是在同一行做輸出，真正輸出是這樣 261220
*/