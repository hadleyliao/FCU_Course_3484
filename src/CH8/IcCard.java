package CH8;

public class IcCard {
    // 不能拿保留字當作變數名稱 比如class、int...等
    String number; // 卡號 => 這是屬性
    int balance;   // 餘額 => 這是屬性

    int add(int money){ //儲值 => 這是動作／行為
        balance = balance + money; // 餘額+錢
        return balance;
    }
    int pay(int money){ // 付款 => 這是動作／行為
        balance = balance-money; // //餘額-錢
        return money;
    }
    void printInfo(){ // 印出資訊 => 這是動作／行為
        System.out.println("Card Number " + number + " balance " + balance);
    }
}
