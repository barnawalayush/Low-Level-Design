package pattern.design.lowLevel.creationalDesignPattern.builderDesignPattern;

import java.util.List;

public class Student {

    String rollNo;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subject;

    public Student(StudentBuilder builder) {
        this.age = builder.age;
        this.rollNo = builder.rollNo;
        this.name = builder.name;
        this.motherName = builder.motherName;
        this.fatherName = builder.fatherName;

    }
}
