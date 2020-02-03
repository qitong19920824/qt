/**
 * @Author: qitong
 * @Date: 2020/1/10 21:55
 */

public class selectionSort {
    public static void main(String[] args) {
        int[]arr={5,3,6,2,9,8};
        int[] arrs = selectionSort(arr);
        for (int i : arrs) {
            System.out.println(i);
        }

    }
    public static int[] selectionSort(int[] arr){
        if (arr.length==0){
            return arr;
        }
        for (int i = 0; i <arr.length ; i++) {
            int minIndex=i;
            for (int j = i; j <arr.length ; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
                int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
}
