/*
   Q:定義一個溫度轉換的類別
   類別

   轉換公式
   攝氏轉華氏：°F = (°C x 9/5) + 32
   華氏轉攝氏：°C = (°F - 32) x 5/9
 */

package CH8;

public class Temperature {
    double toFtemp(double cTemp) { // cTemp是區域變數
        return cTemp * 9.0 / 5 + 32;
        //return result;
    }

    double toCtemp(double fTemp) {
        double result = (fTemp - 32) * 5 / 9.0;
        return result;
    }
}
