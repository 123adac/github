package top.xkk.java.basic.param;

import lombok.extern.slf4j.Slf4j;

/**
 * Java定义了可变长参数，允许在调用方法是传入不定长度的参数
 * 在定义方法是，在最后一个形参后加上三个 ...,表示形参可以传入多个参数，多个参数会被当作数组传入
 * 1.由于可变参数是最后一个参数，所以一个方法最多有一个可变参数
 * 2.可变参数会被看作一个数组
 * 3.可变参数在编译为字节码后，在方法签名中会以数组形态出现
 * 4.这两个方法的签名是一致的，不能作为方法的重载。可变数组可以兼容数组，反之不成立。
 */
@Slf4j
public class VariableLenParam {
    public static void main(String[] args) {
      log.info("1*2*3 = {}", func(1,2,3));
      log.info("2*2*2*2*2 = {}", func(2,2,2,2,2));
      log.info("10*10*10 = {}", func(10,10,10));
    }

    public static int func(int... args) {
        int result = 1;
        for (int i : args) {
            result *= i;
        }
        return result;
    }
}
