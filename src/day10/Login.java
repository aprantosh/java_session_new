package day10;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String password = "neupane";
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the username");
        String username = scanner.next();
        System.out.println("enter your password");
        String password1 = scanner.next();

        if (password1.equals(password)){
            System.out.println("welcome " + username);
        } else{
            System.out.println("access denied");
        }


    }
}