package CH8;

public class Pokemon {
    String name;
    int cp;
    int hp;
    int candy;


    void powerUp() { // 強化
        if (candy < 5) {
            System.out.println("你的candy已經不夠，無法強化");
        } else {
            cp += 10; //cp = cp + 10;
            candy -= 5; //candy = candy - 5;
        }
    }

    void evolve() { // 進化
        if (candy < 15) {
            System.out.println("你的candy已經不夠，無法進化");
        } else {
            cp += 50; //cp = cp + 50;
            candy -= 15; //candy = candy - 15;
        }
    }

    void printInfo() {
        String info = "Pokemon{" +
                "name='" + name + '\'' +
                ", cp=" + cp +
                ", hp=" + hp +
                ", candy=" + candy +
                '}';
        System.out.println(info);
    }
}
