package day10;

import java.util.Scanner;

public class Reference {
    public static void main (String[] args){

//        String password = "neupane";
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your Username");
//        String username = scanner.next();
//
//        System.out.println("Enter your Password");
//        String password1 =scanner.next();
//
//        if (password1.equals(password)) {
//            System.out.println("Acess Given" + " Welcome to the Page " + username);
//        }
//                    else
//            {System.out.println("Access Denied");
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = scanner.next();

        System.out.println("Enter your Math number");
        float maths = scanner.nextFloat();

        System.out.println("Enter your Science number");
        float science = scanner.nextFloat();

        float percentage = ((maths + science)/200) * 100 ;
        System.out.println(percentage);

        String formattedPercentage = String.format("%.2f", percentage);
        System.out.println(formattedPercentage);

    }
}
