public class _4_8_2_ConditionalExpression {
    public static void main(String[] args) {
        int i,j = 17;
        i = (j % 2 == 1) ? 2 : j++;
        System.out.println("變數i現在內容："+i); //變數i現在內容：2
        System.out.println("變數j現在內容："+j); //變數j現在內容：17
    }
}
