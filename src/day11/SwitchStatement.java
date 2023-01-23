package day11;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day of the week");
        String today = sc.next();
        String speicalDish = "";

        switch (today.toLowerCase()){
            case("sunday"):
            case("monday"):
                speicalDish = "bhaat";
                break;
            case("tuesday"):
                speicalDish = "tarkari";
                break;
            case("wednesday"):
                speicalDish = "achaar";
                break;
            case("thursday"):
                speicalDish = "daal";
                break;
            case("friday"):
                speicalDish = "paapad";
                break;
            case("saturday"):
                speicalDish = "roti";
                break;
            default:
                speicalDish = "maasu aayo maasu";
                break;
        }
        System.out.println(speicalDish);
    }
}