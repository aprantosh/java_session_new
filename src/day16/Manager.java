package day16;

import java.time.LocalDate;

public sealed class Manager extends Employee permits Cleaner{

    private double bonus;

    public Manager(String name, LocalDate hireDate, double salary, double bonus) {
        super(name, hireDate, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        double totalSalary = super.getSalary() + bonus;
        return totalSalary;
    }

    @Override
    public String getDescription() {
        String description = "i am the manager";
        return description;
    }



    public void fireEmploye(){

    }
}