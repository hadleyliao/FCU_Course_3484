package CH6.CheckList;

public class Test_01 {
    public static void main(String[] args) {
        int sum = 0;
//  ------------------第１題------------------
//  輸出：49950
//  -----------------------------------------
//        for( int i=1; i<1000 ; i++ ){
//            sum += i;
//        }
//        System.out.println(sum);


//  ------------------第２題------------------
//  輸出：0
//  -----------------------------------------
//        for( int i=1000; i<100 ; i++ ){
//            sum += i;
//        }
//        System.out.println(sum);


//  ------------------第３題------------------
//  輸出報錯：
//        java: cannot find symbol
//        symbol:   variable i
//        location: class Ch6.test01
//  -----------------------------------------
//      for( ;  ; ){
//          sum += i;
//      }
//      System.out.println(sum);


//  ------------------第４題------------------
//  輸出報錯：java: unreachable statement
//  -----------------------------------------
//        for( int i=1; ; i++ ){
//            sum += i;
//        }
//        System.out.println(sum);


//  ------------------第５題------------------
//  輸出報錯：
//        java: cannot find symbol
//        symbol:   variable i
//        location: class Ch6.test01
//  -----------------------------------------
//        for( ; i=5 ; i++ ){
//            sum += i;
//        }
//        System.out.println(sum);
    }
}