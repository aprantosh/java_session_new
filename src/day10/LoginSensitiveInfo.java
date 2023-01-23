package day10;

import java.io.Console;
import java.util.Arrays;

public class LoginSensitiveInfo {
    public static void main(String[] args) {
        Console console = System.console();

        String password = "neupane";

        String username = console.readLine();
        char[] password1 = console.readPassword();
        String pass = Arrays.toString(password1);

        if (pass.equals(password)){
            System.out.println("welcome " + username);
        }else {
            System.out.println("access denied");
        }

    }
}