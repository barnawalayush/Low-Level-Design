package pattern.design.lowLevel.creationalDesignPattern.prototypeDesignPattern;

public class Student implements Prototype{

    int age;
    private int rollNo;
    String name;

    public Student(int age, int rollNo, String name) {
        this.age = age;
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(age, rollNo, name);
    }

}
