package day16;

import java.time.LocalDate;

public class Employee extends Person{

    public Employee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public String getDescription() {
        String description = "i am the employee";
        return description;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}