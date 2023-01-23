import day3.Student;

public class Add {
        public static void main (String[] args) {

            int a= 100;
            int b= 90;
            int d= 70;
            int c = 70;
            if (a>b || a==b) {
                System.out.println("he is passed");
            }
                else if (b>a) {
                System.out.println("Nothing");
            }
                else{
                    System.out.println("hello");
            }


            boolean operatorsigning = (c==d )||( c>d) ;
             System.out.println(operatorsigning);

             int marks= 90;
             String msg = marks >=90? "The student gets the distinction": "the student is 1st division";
             String mesg = marks == 90? "The student is perfect": "Not Perfect" ;
             System.out.println(msg);
             System.out.println(mesg);

            Student student1 = new Student();
            Student student2 = new Student();
            Student student3 = new Student();
            Student student4 = student1;


            System.out.println(student4==student1);
            System.out.println(student4.equals(student1));

        }




}