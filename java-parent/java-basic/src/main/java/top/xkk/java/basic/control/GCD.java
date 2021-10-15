package top.xkk.java.basic.control;

import lombok.extern.slf4j.Slf4j;

/**
 * 最大公约数
 */
@Slf4j
public class GCD {
    public static void main(String[] args) {
        log.info("15和25的最大公约数是：{}",getGCDByLoop(15,25));
        log.info("15和25的最大公约数是：{}",getGCDByRecursion(15,25));
    }

    /**
     * 循环
     *
     * @param a
     * @param b
     * @return 最大公约数
     */
    public static int getGCDByLoop(int a,int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if(b == 0) {
            return a;
        }
        while(a % b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return b;
    }

    /**
     * 递归
     *
     * @param a
     * @param b
     * @return 最大公约数
     */
    public static int getGCDByRecursion(int a,int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if(b == 0) {
            return a;
        }
        return a % b == 0 ? b : getGCDByRecursion(b, a % b);
    }
}
