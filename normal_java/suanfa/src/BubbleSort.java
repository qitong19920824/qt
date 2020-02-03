/**
 * @Author: qitong
 * @Date: 2020/1/9 21:09
 */

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {  //外层循环一次为一趟排序
          /*设置标识，判断这趟排序是否发生了交换。
         如果未发生交换，则说明数组已经有序，不必再排序了*/
            boolean isSwap = false;
            for (int j = 0; j < array.length - 1 - i; j++) //内层循环一次为一次相邻比较
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    isSwap = true;
                }
            if (!isSwap)
                break;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arrs = {3,4,2,1};
        int[] sort = bubbleSort(arrs);
        System.out.println(sort);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(arrs[i] + "   ");

        }
    }
}
