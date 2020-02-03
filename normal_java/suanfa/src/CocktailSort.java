/**
 * @Author: qitong
 * @Date: 2020/1/9 21:56
 */

public class CocktailSort {
    public static void cockTailSort(int[] arr){
        boolean bool=false;
        do {
            for (int i = 0; i <arr.length -1; i++) {
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    bool=true;
                }
            }
            bool=false;
            for (int i = arr.length-1; i >1 ; i--) {
                if (arr[i]<arr[i-1]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    bool=true;
                }
            }
        }while (bool);

    }

    public static void main(String[] args) {
        int[] arr={8,7,2,6,9};
        cockTailSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
