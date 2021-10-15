package top.xkk.java.basic.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayOperation {
    private static final int MAX_SIZE = 10;

    /**
     * 初始化数组
     */
    public static int[] initialize() {
        int[] data = new int[MAX_SIZE];
        Random random = new Random();
        for (int i = 0; i < MAX_SIZE; i++) {
            int num = random.nextInt(100);
            data[i] = num;
        }
        return data;
    }

    /**
     * 输出一维数组
     */
    public static void printArray(int[] arr) {
        System.out.println("\n当前数组元素为：");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    /**
     * 二分查找 (迭代)
     */
    public static int binarySearch(int[] arr, int key) {
        // 定义左右边界
        int left = 0;
        int right = arr.length - 1;
        // 定义middle
        int middle;
        if (key < arr[left] || key > arr[right]) {
            return -1;
        }
        // 循环
        while (left < right) {
            middle = (left + right) / 2;
            if (arr[middle] > key) {
                right = middle - 1;
            } else if (arr[middle] < key) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * 递归
     *
     * @param arr
     * @param x
     * @param left
     * @param right
     * @return
     */
    public static int bSearch(int[] arr,int x,int left,int right) {
        int index = -1;

        if(left < right) {
            int middle = (left + right) / 2;
            if(x > arr[middle]) {
                index = bSearch(arr,x,middle + 1,right);
            } else if (x < arr[middle]) {
                index = bSearch(arr,x,left,middle - 1);
            } else {
                return middle;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(PackageConst.INFO);
        // 初始化
        int[] arr = ArrayOperation.initialize();
        printArray(arr);
        // 排序
        Arrays.sort(arr);
        printArray(arr);
        // 输入想查找的数
        System.out.println("\n请输入要查找的数: ");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        System.out.println("迭代：" + binarySearch(arr,key));
        System.out.println("递归：" + bSearch(arr,key,0,arr.length - 1));
//        while (key != -1) {
//            int index = binarySearch(arr, key);
//            System.out.printf("\n%d 查找定位结果：%d", key,index);
//            System.out.println("\n请输入要查元素：");
//            key = input.nextInt();
//        }
        System.out.println("查找结束！");
    }
}
