package day11;

import java.util.Scanner;

public class Trying_new {

        public static void main (String[] args){

//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the brand of Phone you like");
//            String phone = sc.next();
//            String phonePrice = " ";
//
//            switch (phone.toLowerCase()){
//
//                case ("iphone"):
//                    phonePrice = "$14000";
//                    break;
//                case ("samsung"):
//                    phonePrice ="$150000";
//                    break;
//                case ("nokia"):
//                    phonePrice ="$2222";
//                default:
//                    phonePrice ="Not available";
//                    break;
//            }
//            System.out.println(phonePrice);

            int age = 15;
            double savings = 100;
            double random_savings = Math.random()*1000;
            if(random_savings>=100 && random_savings<=1000) {
                System.out.println(random_savings);
                for (; ; ) {
                    //double random_savings = Math.random()*100;
                    savings += random_savings;
                    if (savings >= 10000) {
                        break;

                    }
                    age++;
                }
            }
            System.out.println("The retirement savings will be "+age);

        }

}
