package CH8;

public class IcCard {
    // 不能拿保留字當作變數名稱 比如class、int...等

    // 以下兩個也稱成員變數／欄位
    String number; // 卡號 => 這是屬性
    int balance;   // 餘額 => 這是屬性

    // 以下三種為成員方法
    int add(int money){ // 儲值 => 這是動作／行為。有回傳值要再方法前打上回傳值型態int
        balance = balance + money; // 餘額+錢
        return balance; // 有回傳值要再方法前打上回傳值型態int
    }
    int pay(int money){ // 付款 => 這是動作／行為。有回傳值要再方法前打上回傳值型態int
        balance = balance-money; // //餘額-錢
        return money; // 有回傳值要再方法前打上回傳值型態int
    }
    void printInfo(){ // 印出資訊 => 這是動作／行為。void表示不會有回傳值
        System.out.println("Card Number " + number + " balance " + balance);
    }
}
