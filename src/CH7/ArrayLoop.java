package CH7;

public class ArrayLoop {
    public static void main(String[] args) {
        double[] students = {70, 65, 90, 85, 95}; // 配置、宣告、設定初始值
        double sum = 0;

        for(double score: students) { //使用特殊形的for迴圈(加強型)
            sum += score; // 加總
        }

        double average = sum / students.length;  // 計算平均
        System.out.println("平均成績:" + average);
    }
}

/*
平均成績:81.0
*/