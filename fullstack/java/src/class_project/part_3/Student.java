package class_project.part_3;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " + this.name +" (" + this.age + ")";
    }
}