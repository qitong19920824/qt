/**
 * @Author: qitong
 * @Date: 2020/1/12 11:41
 */

public class aa {
    public static void main(String[] args) {
        int i = 1;
        int j=4>>> i;
        System.out.println(j);
    }
    public static int[] insetSort(int[]arr){
        if (arr.length==0) return arr;
        int current;
        for (int i = 1; i <arr.length ; i++) {
            current=arr[i];
            int preIndex=i-1;
            if (preIndex>=0&&current<arr[preIndex]){
                arr[preIndex+1]=arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1]=current;

        }
        return arr;
    }
    public static int[] binartInsertionSort(int[]arr){
        if (arr.length==0) return arr;
        for (int i = 0; i <arr.length ; i++) {
            int left=0,right=i-1;
            int current=arr[i];
            while (left<=right){
                int mid=left+((right-left)>>1);
                if (arr[mid]>current){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
                for (int j = i-1; j >=left ; j--) {
                    arr[j+1]=arr[j];
                }
                arr[left]=current;
            }
        }
        return arr;
    }
    public static int[] bubbleSort(int[]arr){
        if (arr.length==0) return arr;
        for (int i = 0; i <arr.length ; i++) {
            boolean bool=false;
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    bool=true;
                }
            }
            if (!bool){
                break;
            }

        }
        return arr;
    }
}
