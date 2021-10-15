package top.xkk.java.basic.datatype;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;

@Slf4j
public class ValueOverflow {
    public static void main(String[] args) {
        log.info("=================== wrong1 ===================");
        wrong();
        log.info("=================== right1 ===================");
        right1();
        log.info("=================== right2 ===================");
        right2();
    }

    private static void wrong() {
        long l = Long.MAX_VALUE;
        log.info(String.valueOf(l + 1));
        log.info(String.valueOf(l + 1 == Long.MIN_VALUE));
    }

    private static void right1() {
        try {
            long l = Long.MAX_VALUE;
            System.out.println(Math.addExact(l,1));
        } catch (Exception ex) {
            log.error(ex.toString());
        }
    }

    private static void right2() {
        BigInteger i = new BigInteger(String.valueOf(Long.MAX_VALUE));
        log.info(i.add(BigInteger.ONE).toString());
        try {
            long longValur = i.add(BigInteger.ONE).longValueExact();
            log.info(String.valueOf(longValur));
        } catch (Exception ex) {
            log.error(ex.toString());
        }
    }
}
