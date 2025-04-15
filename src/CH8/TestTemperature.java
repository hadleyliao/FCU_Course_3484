package CH8;

public class TestTemperature {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        double fResult = t1.toFtemp(71);
        System.out.println(fResult);
        fResult = t1.toFtemp(14);
        System.out.println(fResult);
    }
}
