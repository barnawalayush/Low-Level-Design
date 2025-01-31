package pattern.design.lowLevel.creationalDesignPattern.builderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {
    String rollNo;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subject;

    public StudentBuilder setRollNo(String rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setSubject(List<String> subject) {
        this.subject = subject;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
