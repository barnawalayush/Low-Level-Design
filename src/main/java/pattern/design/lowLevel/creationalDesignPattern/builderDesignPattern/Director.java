package pattern.design.lowLevel.creationalDesignPattern.builderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNo("3").setAge(14).setName("Ayush").setMotherName("vsdv").build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNo("5").setAge(18).setName("Ankur").setMotherName("dfvd").build();
    }
}
