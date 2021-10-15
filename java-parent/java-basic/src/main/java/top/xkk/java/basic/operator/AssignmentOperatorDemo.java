package top.xkk.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        b <<= 2; // 左移两位后赋值
        log.info("b <<= 2 = " + b);

        b >>= 2;    // 右移两位后赋值
        log.info("b >>= 2 = " + b);

        b &= a; //按位与后赋值
        log.info("b &= a = " + b);

        b ^= a; // 按位异或后赋值
        log.info("b ^= a = " + b);

        b |= a; // 按位或后赋值
        log.info("b |= a = " + b);
    }
}
