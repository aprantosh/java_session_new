package day8;

import day3.Student;

public class RelationalOperator {
    public static void main(String[] args) {
        int m = 90;
        int n = 9;

//        note: m = n vaneko chai n ko value m maa haalnu ho

        if (m < n || m == n) {
            System.out.println("success");
        }else {
            System.out.println("failed");
        }

        boolean checkAndOperator = (m != n) && (m > 0);
        System.out.println(checkAndOperator);

        int mark = 90;
        String msg = (mark >= 90) ? "congratulation successful peeeeeeeepol" : "try again successful peeeeople";
        System.out.println(msg);

        Student student1 = new Student();
        Student student2 = student1;

        Student student3 = new Student();

        System.out.println(student1 == student2);
        System.out.println(student1 == student3);

        //object ko laagi chai yasari use garne
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
    }
}