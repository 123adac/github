package top.xkk.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * Instanceof操作符
 */
@Slf4j
public class InstanceofOperatorDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        boolean result = animal instanceof Cat;
        log.info(String.valueOf(result));
    }

    static class Animal {

    }

    static class Cat extends Animal{

    }
}
