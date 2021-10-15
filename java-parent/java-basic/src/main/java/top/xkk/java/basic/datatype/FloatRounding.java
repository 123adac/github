package top.xkk.java.basic.datatype;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 浮点数舍入联系
 */
@Slf4j
public class FloatRounding {
    public static void main(String[] main) {
      log.info("======================= wrong1 =======================");
      wrong1();
      log.info("======================= wrong1 =======================");
      wrong2();
      log.info("======================= wrong1 =======================");
      right();
    }

    private static void wrong1() {
        double num1 = 3.35;
        float num2 = 3.35f;
        log.info(String.format("%.1f", num1));  // 四舍五入
        log.info(String.format("%.1f", num2));  // 舍
    }

    private static void wrong2() {
        double num1 = 3.35;
        float num2 = 3.35f;
        DecimalFormat format = new DecimalFormat("#.##");
        format.setRoundingMode(RoundingMode.DOWN);
        log.info(format.format(num1));
        format.setRoundingMode(RoundingMode.DOWN);
        log.info(format.format(num2));
    }

    private static void right() {
        BigDecimal num1 = new BigDecimal("3.35");
        BigDecimal num2 = num1.setScale(1,RoundingMode.DOWN); // 向下
        log.info(String.valueOf(num2));
        BigDecimal num3 = num1.setScale(1,RoundingMode.HALF_UP);    // 向最接近的舍入
        log.info(String.valueOf(num3));
    }
}
