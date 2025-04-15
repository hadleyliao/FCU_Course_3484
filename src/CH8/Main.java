package CH8;

public class Main {
    public static void main(String[] args) {
        IcCard myCard = new IcCard();
        // 想像new是工廠，IcCard()是設計圖=>所以就是根據設計圖，產出一個物件要用一個變數myCard去接它
        // Java是強型態語言，所以前面要給他型別，以前都是八個「基本型別」；現在是我們自己定義的「類別型態」就是IcCard
        // 補充：String是『系統定義的類別』

        // 開始產出物件
        myCard.number = "C1234";
        myCard.balance = 100;
        myCard.printInfo();

        myCard.add(100);
        myCard.printInfo();

        myCard.number = "C5678";
        myCard.balance = 300;
        myCard.printInfo();

        myCard.pay(50);
        myCard.printInfo();
    }
}
