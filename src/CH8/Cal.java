package CH8;

public class Cal {
    public static void main(String[] args) {

        int div1 = 5/2; // 2
        System.out.println(div1);

        double div2 = 5.0/2.0; // 2.5 // 小數預設double
        System.out.println(div2);

        double div3 = 5/2.0; // 2.5 // 除號左右邊其中一個是double型態 ＝> 算出來是double
        System.out.println(div3);

        double div4 = 5.0/2; // 2.5 // 除號左右邊其中一個是double型態 ＝> 算出來是double
        System.out.println(div4);

        double div5 = 5/2; // 2.0 // 除號左右邊其中一個是int型態 ＝> 算出來是int = 2 ＝> 指派給等號左邊的double型態所以是2.0
        System.out.println(div5);

        double pi = 3.14159;
        int div6 = (int)pi; // 在pi之前使用強制轉型
        System.out.println(div6); // 3

        // 記憶體空間大到小排列：double > int > short > byte

        double a = 10;
        short b = (short) 1.0;
        System.out.println(b); // 1

    }
}
