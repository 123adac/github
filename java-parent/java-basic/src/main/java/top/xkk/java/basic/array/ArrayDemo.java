package top.xkk.java.basic.array;

public class ArrayDemo {
    /**
     * 求数组元素之和
     *
     * @param array 整型形参数组
     * @return int:元素之和
     */
    public int getSum(int[] array) {
        int sum = 0;
        for(int i = 0;i < array.length;i++) {
            sum += i;
        }
        return sum;
    }
}
