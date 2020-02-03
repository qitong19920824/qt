import java.util.Arrays;

/**
 * @Author: qitong
 * @Date: 2020/1/12 12:10
 */

public class CountingSort {
    public static int[] countingSort(int[]arr){
        if (arr.length==0) return arr;
        int bias,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        //计算偏移量，将min-max映射到bucket数组的0-（max-min）位置上
        bias=-min;
        int[] bucket=new int[max-min+1];
        Arrays.fill(bucket,0);
        for (int i = 0; i <arr.length ; i++) {
            bucket[arr[i]+bias]++;
        }
        int index=0,i=0;
        while (index<arr.length){
            if (bucket[i]!=0){
                arr[index]=i-bias;
                bucket[i]--;
                index++;
            }else {
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={5,3,6,2,9,8};
        int[] arrs = countingSort(arr);
        for (int i : arrs) {
            System.out.println(i);
        }

    }
}
