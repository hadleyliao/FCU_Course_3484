package CH7;

public class RainArray {
    public static void main(String[] args) {
        String[] city = {"台北", "基隆", "宜蘭"};
        double[][] rain = //月平均雨量
                // 1月   2月    3月    4月     5月    6月
                {{83.2, 170.3, 180.4, 177.8, 234.5, 325.9}, // 台北
                 {331.6, 397.0, 321.0, 242.0, 285.1, 301.6}, // 基隆
                 {147.0, 182.3, 127.5, 138.4, 211.7, 214.2}}; // 宜蘭
        int indexMin = 0, indexMax = 0;

        // 找個月份雨量最低、最高者
        for (int month = 0; month < 6; month++) {
            for(int i=0; i<rain.length; i++) {
                if(rain[i][month] < rain[indexMin][month])
                    indexMin = i; // 更新平均雨量最低的城市

                if(rain[i][month] > rain[indexMax][month]){
                    indexMax = i; // 更新平均雨量最高的城市
                }
            }
            System.out.println((month+1)+"月平均最低:" + city[indexMin] + "\t最高:" + city[indexMax]);
        }
    }
}

/*
1月平均最低:台北	最高:基隆
2月平均最低:台北	最高:基隆
3月平均最低:宜蘭	最高:基隆
4月平均最低:宜蘭	最高:基隆
5月平均最低:宜蘭	最高:基隆
6月平均最低:宜蘭	最高:台北
*/