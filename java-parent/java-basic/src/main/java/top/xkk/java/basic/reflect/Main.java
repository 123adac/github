package top.xkk.java.basic.reflect;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            Class clazz = Class.forName("top.xkk.java.basic.reflect.Student");

            // 获取 main 方法
            Method methodMain = clazz.getMethod("main",String[].class); // 第一个参：方法名；第二个参：方法的形参类型

            // 调用
            //第一个参数，对象类型，因为方法是static静态的，所以为null可以，第二个参数是String数组
            //这里拆的时候将  new String[]{"a","b","c"} 拆成3个对象,所以需要将它强转
            methodMain.invoke(null, (Object)new String[]{"x","k","k"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
