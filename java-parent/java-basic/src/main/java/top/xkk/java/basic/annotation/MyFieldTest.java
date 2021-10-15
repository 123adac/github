package top.xkk.java.basic.annotation;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

@Slf4j
public class MyFieldTest {
    private static MyField annotation;

    /**
     * 使用自定义注解
     */
    @MyField(description = "学习之路",length = 12)
    private String username;

    public static void main(String[] args) {
        // 获取类模板
        Class<MyFieldTest> c = MyFieldTest.class;

        // 获取所有字段
        for(Field f : c.getDeclaredFields()) {
            // 判断这个字段是否有MyField注解
            if (f.isAnnotationPresent(MyField.class)) {
                MyField annotation = f.getAnnotation(MyField.class);
                log.info("字段：{},描述：{}", f.getName(), annotation.description());
                log.info("长度：{}", annotation.length());
            }
        }
    }
}
