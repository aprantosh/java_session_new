package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class ArrayListPractice {

    public static void main(String[] args) {
//
//        Student[] students = new Student[4];
//        students[0] = new Student("anish","1","1");
//        students[1] = new Student("ramesh","2","2");
//        students[2] = new Student("riwaj","3","3");
//        students[3] = new Student("abhijeet","4","4");

//        ArrayList<Student> students = new ArrayList<>(2);
//        mathi 2 le chai array ko size vanchha, yo didaa better ho



        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("anish","1","1"));
        students.add(new Student("ramesh","2","2"));

        System.out.println(students);

        students.add(0,new Student("riwaj","420","420"));

        //replace maatrai garnu paryo vane
        students.set(0,new Student("riwaj1","420","420"));

        //remove
        students.remove(1);

        //remove other way with object (entity maa yasko lagi equals and hashcode generate garna nabirsinu)
        Student studentToDelete = new Student("riwaj1","420","420");
        students.remove(studentToDelete);
        //if you want to delete more than one at once
//        students.removeAll()

        //remove with value
        students.removeIf(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getName().equals("c");
                //integer ko laagi
//                return student.getName() == 1;
            }
        });

        //yasle sabai delete gardinchha
        students.clear();

        ArrayList<Student> students1 = new ArrayList<>(students);
        //yasmaa students maa vako kura maa add garna sakinchha aba
//        students1.addAll(students);
//        ArrayList<Student> students1 = new ArrayList<>(students);
//        students1.contains(new Student("ram","1","2"));
//        contains le chai is equals chha chhaina check garchha

//        for (Student s:: students) {
        //(Object o : object)
//        }
//        yo for loop ko enhanced version chai yo tala ko ho
//

//        yo very very imp ho, yo foreach chai use garne ho lamda expression wala
//        students1.forEach(student -> {
//            System.out.println(student);
//        });

        students1.isEmpty();

//        range from check garne ho yasari
//          yasle 3rd dekhi 6th samma dinchha
        //pachhadi ko exclusive hunchha
//       List<Student> studentList = students1.subList(3,7);

//        reverse garna chai
//        Collections.reverse(students1);

    }
}