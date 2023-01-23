package day16;

import java.time.LocalDate;

public abstract class Person {

    private String name;
    private LocalDate hireDate;
    private double salary;

    public Person(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    //final keyword use gare pachhi override garna mildaina child class maa, yasle protect garchha method lai
    public final LocalDate getHireDate() {
        return hireDate;
    }

    public abstract String getDescription();

    public double getSalary() {
        return salary;
    }
}