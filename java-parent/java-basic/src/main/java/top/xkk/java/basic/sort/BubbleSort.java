package top.xkk.java.basic.sort;

public class BubbleSort {
    /**
     * 冒泡排序
     */
    public static void bubbleSort1(int a[], int n) {
        for(int i = 0;i < n;i++) {
            for(int j = 1;j < n-i; j++) {
                if(a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,2,4,6,8};
        BubbleSort.bubbleSort1(arr,arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
