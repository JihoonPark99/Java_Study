package Lab6;

public class Class {
    private String className;
    private Student[] students;

    // Student realstudent = new Student();

    public Class(int num) {
        className = "";
        students = new Student[num];
    }

    public void setClassName(String name) {
        className = name;
    }

    public String getClassName() {
        return className;
    }

    public void setStudent(int index, Student student) {
        students[index] = student;
        // realstudent.setuserName(student);
    }

    public Student getStudent(int index) {
        return students[index];
    }

}
