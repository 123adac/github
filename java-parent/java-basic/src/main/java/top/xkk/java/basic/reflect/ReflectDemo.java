package top.xkk.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Slf4j
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        // 获取TargetObject类的Class对象
        Class<?> targetClass = Class.forName("top.xkk.java.basic.reflect.TargetObject");
        // 创建TargetObject类无参构造方法，创建实例
        TargetObject targetObject = (TargetObject)targetClass.getDeclaredConstructor().newInstance();

        // 获取TargetObject类中所有定义的非构造方法
        Method[] methods = targetClass.getDeclaredMethods();
        for(Method method : methods) {
            log.info("all methods： {}", method.getName());
        }

        // 获取publicMethod方法并调用
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject,"Java");

        // 获取指定参数value并进行修改，赋值为JavaStudy
        Field field = targetClass.getDeclaredField("value");
        field.setAccessible(true);  // 暴力进入，忽略修饰符
        field.set(targetObject,"JavaStudy");

        // 调用privateMethod方法
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}
