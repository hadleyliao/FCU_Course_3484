package CH7;

public class ArrayAvrtage {
    public static void main(String[] args) {
        double[] students;
        students = new double[5];

        students[0] = 70;
        students[1] = 65;
        students[2] = 90;
        students[3] = 85;
        students[4] = 95;

        double sum = 0;
        for(int i=0; i<students.length; i++){
            sum += students[i];
        }
        double average = sum/students.length;
        System.out.println("平均成績："+average);
    }
}


/*
平平均成績：81.0
*/