package CH7;

public class Average {
    public static void main(String[] args) {
        // 學生成績
        double student1 = 70;
        double student2 = 65;
        double student3 = 90;
        double student4 = 85;
        double student5 = 95;

        // 加總
        double sum = student1 + student2 + student3 + student4 + student5;

        // 平均
        double average = sum/5;

        System.out.println("平均成績：" + average);
    }
}


/*
平平均成績：81.0
*/