package top.xkk.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * 位操作符
 */
@Slf4j
public class BitsOperatorDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 0;

        c = a & b;    // 按位与
        log.info("a & b = " + c);

        c = a | b;    // 按位或
        log.info("a | b = " + c);

        c = a ^ b;    // 按位异或
        log.info("a ^ b = " + c);

        c = ~a;    // 按位非
        log.info("~a = " + c);

        c = a << 2;    // 左移
        log.info("a << 2 = " + c);

        c = a >> 2;    // 右移
        log.info("a >> 2 = " + c);

        c = a >>> 2;    // 无符号右移
        log.info("a >>> 2 = " + c);
    }
}
