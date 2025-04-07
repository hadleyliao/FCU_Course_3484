package CH7;

public class MultiArrayForeach {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for(int[] i:a){ // 使用for-each
            for(int j:i){ // 使用for-each
                System.out.print(j + "\t"); // \t跳脫字元，代表tab縮排
            }
            System.out.println(""); // println換行
        }
    }
}

/* 輸出
1	2	3	4
5	6	7	8
*/