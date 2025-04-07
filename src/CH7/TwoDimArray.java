package CH7;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] a = new int [3][4];
        System.out.println("a共有" + a.length + "個元素。");

        for(int i = 0;i<a.length;i++) {
            System.out.println("a["+i+"]共有"+a[i].length+"個元素。");
        }
    }
}

/*
a共有3個元素。
a[0]共有4個元素。
a[1]共有4個元素。
a[2]共有4個元素。
*/