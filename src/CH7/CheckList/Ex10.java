// 請撰寫一個程式，找出陣列中是否有某個元素的索引碼與元素值相等

package CH7.CheckList;

public class Ex10 {
    public static void main(String[] args) {
        int[] array = {0, 5, 2, 1, 4};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == i) {
                System.out.println("第 " + i + " 個元素值和索引碼相同：" + array[i]);
            }
        }
    }
}

/*
第 0 個元素值和索引碼相同：0
第 2 個元素值和索引碼相同：2
第 4 個元素值和索引碼相同：4
*/