package top.xkk.java.basic.enumeration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateMachine {
    public static String getTrafficInstruct(Signal signal) {
        String instruct = "信号灯故障";
        switch (signal) {
            case RED:
                instruct = "红灯停";
                break;
            case GREEN:
                instruct = "绿灯行";
                break;
            case YELLOW:
                instruct = "黄灯注意";
                break;
            default:
                break;
        }
        return instruct;
    }

    public static void main(String[] args) {
        log.info(getTrafficInstruct(Signal.RED));
        log.info(getTrafficInstruct(Signal.GREEN));
        log.info(getTrafficInstruct(Signal.YELLOW));
    }
}

enum Signal {
    /**
     * 红灯
     */
    RED,
    /**
     * 黄灯
     */
    YELLOW,
    /**
     * 绿灯
     */
    GREEN,
}
