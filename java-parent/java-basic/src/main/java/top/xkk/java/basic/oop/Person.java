package top.xkk.java.basic.oop;

public class Person implements Cloneable{
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {

    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person newPerson = (Person) super.clone();
        newPerson.name = new String(this.name);
        return newPerson;
    }
}
