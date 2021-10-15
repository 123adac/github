package top.xkk.java.basic.oop;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(23, "zhang");
//        Person p1 = p;
//
//        System.out.println(p);
//        System.out.println(p1);
        Person p1 = null;
        try {
            p1 = (Person) p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
//        System.out.println(p);
//        System.out.println(p1);
        String result = p.getName() == p1.getName() ? "clone是浅拷贝的" : "clone是深拷贝的";
        System.out.println(result);
    }
}