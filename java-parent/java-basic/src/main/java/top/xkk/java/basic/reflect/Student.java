package top.xkk.java.basic.reflect;

public class Student {
    public static void main(String[] args) {
        System.out.println("main 方法执行了");
    }

        // (默认构造方法)
    Student(String str) {
        System.out.println("默认构造方法 s = " + str);
    }

    // 无参构造
    public Student() {
        System.out.println("调用了共有、无参构造方法");
    }

    // 一个参数的构造
    public Student(char name) {
        System.out.println("姓名：" + name);
    }

    // 多个参数的构造
    public Student(String name,int age) {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
    }

    // 受保护的构造
    protected Student(boolean n) {
        System.out.println("受保护的构造 n = " + n);
    }

    // 私有构造
    private Student(int age) {
        System.out.println("私有构造 年龄：" + age);
    }
//    public Student() {
//
//    }

    //**********字段*************//
    public String name;
    protected int age;
    char sex;
    private String phoneNum;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", sex=" + sex
                + ", phoneNum=" + phoneNum + "]";
    }

    //**************成员方法***************//
    public void show1(String s){
        System.out.println("调用了：公有的，String参数的show1(): s = " + s);
    }
    protected void show2(){
        System.out.println("调用了：受保护的，无参的show2()");
    }
    void show3(){
        System.out.println("调用了：默认的，无参的show3()");
    }
    private String show4(int age){
        System.out.println("调用了，私有的，并且有返回值的，int参数的show4(): age = " + age);
        return "18";
    }
}
