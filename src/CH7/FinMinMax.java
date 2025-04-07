package CH7;

public class FinMinMax {
    public static void main(String[] args) {
        int[]temp = {21,18,21,23,25,25,24,22,22,16,-3,30};
        int min = temp[0];
        int max = temp[0];

        for(int i: temp){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        System.out.println("全台目前最低的溫度是:" + min + "度");
        System.out.println("全台目前最高的溫度是:" + max + "度");
    }
}

/*
全台目前最低的溫度是:16度
全台目前最高的溫度是:25度
*/