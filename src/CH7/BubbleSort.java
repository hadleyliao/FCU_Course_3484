// 由小到大

package CH7;

public class BubbleSort {
    public static void main(String[] args) {
        int [] data = {23,54,33,5,7,46,99,35};
        int temp;

        for(int i=0; i<data.length-1; i++){
            for(int j = 0; j <data.length-i-1; j++){
                if(data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
            for(int k: data){
                System.out.print(" " + k);
            }
            System.out.println("");
        }
    }
}

/* 輸出
 23 33 5 7 46 54 35 99
 23 5 7 33 46 35 54 99
 5 7 23 33 35 46 54 99
 5 7 23 33 35 46 54 99
 5 7 23 33 35 46 54 99
 5 7 23 33 35 46 54 99
 5 7 23 33 35 46 54 99
*/