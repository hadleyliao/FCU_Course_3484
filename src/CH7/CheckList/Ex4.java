/*
請撰寫程式，將陣列的內容反轉，舉例來說，如果陣列的內容如下:
30,20,10,5,34
您的程式必須將陣列內容改為:
34,5,10,20,30
*/

package CH7.CheckList;

public class Ex4 {
    public static void main(String[] args) {
        int[] data = {30, 20, 10, 5, 34};

        System.out.println("原始陣列：");
        printArray(data);

        // 反轉陣列
        for (int i = 0; i < data.length / 2; i++) {
            int temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }

        System.out.println("反轉後陣列：");
        printArray(data);
    }

    // 輔助方法：列印陣列
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

/*
原始陣列：
30, 20, 10, 5, 34
反轉後陣列：
34, 5, 10, 20, 30
*/