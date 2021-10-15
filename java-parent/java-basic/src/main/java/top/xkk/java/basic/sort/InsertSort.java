package top.xkk.java.basic.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8};
        log.info("排序之前：{}", Arrays.toString(arr));
        insertSort(arr);
        log.info("排序之后：{}",Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        for (int i = 1;i < arr.length;i++) {
            if(arr[i] < arr[i-1]) {
                int t = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > t) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = t;
            }
        }
    }
}
