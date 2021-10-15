package top.xkk.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

/**
 * Java反射之Class类的练习
 * 万物皆对象
 * 类的类型是Class
 * 反射机制，欲获取一个类或者调用某个类的方法，首先要获取到类的 Class 对象
 */
@Slf4j
public class ClassDemo {
    public static void main(String[] args) {
        // Java API 中，提供了三种方法获取 Class 类对象。

        // 第一种，使用 Class，forName 静态方法。 前提：已明确类的全路径名
        Class class1 = null;
        try {
            class1 = Class.forName("top.xkk.java.basic.reflect.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 第二种，使用 .class 方法。说明：仅适合在编译前就已经明确要操作的 Class
        Class class2 = User.class;

        // 第三种，使用类对象的 getClass() 方法。适合有对象示例的情况下
        User user = new User();
        Class class3 = user.getClass();

        // 结果
        log.info("class1:",class1);
        log.info("class2:",class2);
        log.info("class3:",class3);
        log.info(String.valueOf(class1 == class2));
        log.info(String.valueOf(class3 == class2));
    }
}
