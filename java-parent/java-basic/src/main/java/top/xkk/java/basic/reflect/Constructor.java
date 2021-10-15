package top.xkk.java.basic.reflect;

import java.lang.reflect.InvocationTargetException;

/*
 * 通过Class对象可以获取某个类中的：构造方法、成员变量、成员方法；并访问成员；
 *
 * 1.获取构造方法：
 * 		1).批量的方法：
 * 			public Constructor[] getConstructors()：所有"公有的"构造方法
            public Constructor[] getDeclaredConstructors()：获取所有的构造方法(包括私有、受保护、默认、公有)

 * 		2).获取单个的方法，并调用：
 * 			public Constructor getConstructor(Class... parameterTypes):获取单个的"公有的"构造方法：
 * 			public Constructor getDeclaredConstructor(Class... parameterTypes):获取"某个构造方法"可以是私有的，或受保护、默认、公有；
 *
 * 			调用构造方法：
 * 			Constructor-->newInstance(Object... initargs)
 */
public class Constructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1.加载 Class 对象
        Class clazz = Class.forName("top.xkk.java.basic.reflect.Student");

        // 2.获取所有公有构造方法
        System.out.println("**************** 所有公有构造方法 ****************");
        java.lang.reflect.Constructor[] conArray = clazz.getConstructors();
        for(java.lang.reflect.Constructor c : conArray) {
            System.out.println(c);
        }

        System.out.println("**************** 所有构造方法 ****************");
        conArray = clazz.getDeclaredConstructors();
        for(java.lang.reflect.Constructor c : conArray) {
            System.out.println(c);
        }

        System.out.println("**************** 公有无参构造方法 ****************");
        java.lang.reflect.Constructor con = clazz.getConstructor(null);
        System.out.println("con = " + con);

        System.out.println("**************** 获取私有构造方法，并调用 ****************");
        con = clazz.getDeclaredConstructor(char.class);
        System.out.println(con);
        // 调用
        con.setAccessible(true); // 暴力访问，忽略修饰符
        Object obj = con.newInstance('男');
    }
}
