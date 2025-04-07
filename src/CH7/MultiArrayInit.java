package CH7;

public class MultiArrayInit {
    public static void main(String[] args) {
        // 直接配置與設定元素值
        int[][] a = {{1, 2, 3, 4},  // 可排成2x4
                     {5, 6, 7, 8}}; // 的型式以方便閱讀
        System.out.println("a共有" + a.length +"個元素。");

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]共有" + a[i].length + "個元素。");

            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "]:" + a[i][j]);
            }
        }
    }
}

/*
a共有2個元素。
a[0]共有4個元素。
a[0][0]:1
a[0][1]:2
a[0][2]:3
a[0][3]:4
a[1]共有4個元素。
a[1][0]:5
a[1][1]:6
a[1][2]:7
a[1][3]:8
*/