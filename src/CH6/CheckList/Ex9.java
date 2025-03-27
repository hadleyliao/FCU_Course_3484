package CH6.CheckList;

public class Ex9 {
    public static void main(String[] args) {
        int i = 0;
        do{
            i++;
            System.out.println("*");
        }while(i<10);
    }
}

/*
輸出10個*
do-while迴圈，是先do執行，後while判斷，所以無論怎樣都會先做一次
do的{}裡輸出1個*
while的(條件運算式i<10) 所以會輸出9個*
所以程式總共輸出10個*
*/