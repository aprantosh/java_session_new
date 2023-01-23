package day16;

import java.time.LocalDate;

public class OfficeApplication {

    public static void main(String[] args) {
        Employee ram = new Employee("ram", LocalDate.now(),1000);

        Manager neupane = new Manager("neupane", LocalDate.now(), 5000, 2000);

        Cleaner prantosh = new Cleaner("regmee", LocalDate.now(), 1000,0);

        prantosh.fireEmploye();

        someFunction(neupane);

        System.out.println(ram.getSalary());
        System.out.println(neupane.getSalary());

        System.out.println(ram.getDescription());
        System.out.println(neupane.getDescription());
    }
    public static void someFunction(Person person){
        if(person instanceof Manager){
            ((Manager)person).fireEmploye();
        }


    }
}