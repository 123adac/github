package top.xkk.weather.util;

import java.math.BigDecimal;

public class NumberUtil {
    public static double format(Object value) {
        Double num = 0.0;
        num = new Double(value.toString());
        BigDecimal bigDecimal = new BigDecimal(num);
        return bigDecimal.setScale(2,BigDecimal.ROUND_DOWN).doubleValue();
    }
}
