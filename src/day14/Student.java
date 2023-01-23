package day14;

public class Student implements Comparable<Student> {
    public String name, age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(String name, String age) {
        this.age= age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
     //  return this.name.compareTo(o.name);
           //return this.age > o.age;
       //    return this.age - o.age;
        return this.age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}