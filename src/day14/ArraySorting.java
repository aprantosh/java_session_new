package day14;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {
    public static void main(String[] args) {
        String[] names = {"ello","z"};

        Arrays.sort(names, Comparator.reverseOrder());
       // System.out.println(Arrays.toString(names));

        //TODO
        Student[] students = new Student[2];
        students[0] = new Student("prantosh","22");
        students[1] = new Student("neupane","31");

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        System.out.println(Arrays.toString(students));


    }
}