/**
 * @Author: qitong
 * @Date: 2020/1/11 13:55
 */

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        if (arr.length==0){
            return arr;
        }
        int current;
        for (int i = 1; i <arr.length ; i++) {
            current=arr[i];
            int preIndex=i-1;
            while (preIndex>=0&&current<arr[preIndex]){
                arr[preIndex+1]=arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1]=current;
        }
        return arr;
    }

    public static int[] binartInsertionSort(int[]arr){
        if (arr.length==0)
            return arr;
        for (int i = 1; i <arr.length ; i++) {
            int left=0;
            int right=i-1;
            int current=arr[i];
            while (left<=right){
                int mid=left+((right-left)>>1);
                if (arr[mid]>current){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }
            for (int j = i-1; j >=left; j--) {
                arr[j+1]=arr[j];
            }
            arr[left]=current;

        }
        return arr;
    }

    public static void main(String[] args) {
        /*int[]arr={5,3,6,2,9,8};
        int[] sort = insertionSort(arr);
        for (int i : sort) {
            System.out.print(i+" ");
        }
        System.out.println();*/
        int[]arr={5,3,6,2,9,8};
        //insertionSort(arr);
        int[] ints = binartInsertionSort(arr);
        for (int i : ints) {
            System.out.print(i+" ");
        }
    }
}
