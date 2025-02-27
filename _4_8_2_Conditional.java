public class _4_8_2_Conditional {
    public static void main(String[] args) {
        boolean lightIsOn = false;
        System.out.println(lightIsOn? "燈亮了":"燈熄了"); //燈熄了

        lightIsOn = !lightIsOn;
        System.out.println(lightIsOn? "燈亮了":"燈熄了"); //燈亮了
    }
}
