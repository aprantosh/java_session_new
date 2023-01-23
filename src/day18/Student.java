package day18;

import java.util.Objects;

public class Student {

    private String name;
    private String rollNumber;
    private String className;

    public Student(String name, String rollNumber, String className) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(rollNumber, student.rollNumber) && Objects.equals(className, student.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber, className);
    }
}