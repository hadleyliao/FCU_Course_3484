package CH6.CheckList;

public class Ex10 {
    public static void main(String[] args) {
        int i = 0;
        do{
            for(i=0;i<10;i++){
                while(i<4){
                    System.out.println("*");
                }
            }
        }while(i<10);
    }
}

/*
無窮迴圈
一開始i＝0往下進do進for再跑進while (i < 4)迴圈裡時，就在印 System.out.println("*"); 這行
因為while的()裡面是只有條件運算式，沒有控制運算式，所以導致i永遠都是一樣的值=0，也永遠都在while迴圈輸出 System.out.println("*");
所以這程式的i也沒有機會上去到for迴圈中進行控制運算式的i++遞增，i也只會永遠=0
*/