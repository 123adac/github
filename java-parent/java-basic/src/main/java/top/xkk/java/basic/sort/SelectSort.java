package top.xkk.java.basic.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8};
        selectSort(arr);
        for (int i : arr) {
            log.info(i + " ");
        }
    }

    public static void selectSort(int[] arr) {
        for(int i = 0; i <arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
