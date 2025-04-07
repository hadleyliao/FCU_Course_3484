// 由大到小

package CH7.CheckList;

public class Ex3 {
    public static void main(String[] args) {
        int [] data = {23,54,33,5,7,46,99,35};
        int temp;

        for(int i=0; i<data.length-1; i++){
            for(int j = 0; j <data.length-i-1; j++){
                if(data[j] < data[j+1]){
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
 54 33 23 7 46 99 35 5
 54 33 23 46 99 35 7 5
 54 33 46 99 35 23 7 5
 54 46 99 35 33 23 7 5
 54 99 46 35 33 23 7 5
 99 54 46 35 33 23 7 5
 99 54 46 35 33 23 7 5
*/