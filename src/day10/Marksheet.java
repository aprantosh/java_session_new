package day10;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i =0;i<=5;i++){
            System.out.println("enter student's name");
            String studentName = scanner.next();

            System.out.println("enter marks obtained in maths");
            float markMaths = scanner.nextFloat();

            System.out.println("enter marks obtained in physics");
            float markPhysics = scanner.nextFloat();

            System.out.println("enter marks obtained in computer");
            float markComputer = scanner.nextFloat();

            System.out.println("enter marks obtained in material");
            float markMaterial = scanner.nextFloat();

            System.out.println("enter marks obtained in drawing");
            float markDrawing = scanner.nextFloat();

            System.out.println("==================================");

            float grandTotal = (markMaths + markPhysics + markMaterial + markComputer + markDrawing);

            float percentage = (grandTotal/500) * 100;

            String formattedPercentage = String.format("%.2f", percentage);

            if((markMaths < 40) || (markPhysics < 40) || (markMaterial < 40) || (markComputer < 40) || (markDrawing < 40)){
                markDisplay(markMaths,markPhysics,markMaterial,markComputer,markDrawing);
                System.out.println("sorry, you failed this time,  better luck next time.");

            } else if (percentage >= 80 ) {
                markDisplay(markMaths,markPhysics,markMaterial,markComputer,markDrawing);
                msgDisplay("distinction", studentName, formattedPercentage);

            } else if (percentage >= 65 && percentage <=80) {
                markDisplay(markMaths,markPhysics,markMaterial,markComputer,markDrawing);
                msgDisplay("first division", studentName, formattedPercentage);

            } else if (percentage >= 55 && percentage < 65) {
                markDisplay(markMaths,markPhysics,markMaterial,markComputer,markDrawing);
                msgDisplay("second division", studentName, formattedPercentage);

            } else if (percentage >= 40 && percentage < 55) {
                markDisplay(markMaths,markPhysics,markMaterial,markComputer,markDrawing);
                msgDisplay("third division", studentName, formattedPercentage);
            }
        }

    }
    public static void msgDisplay(String displayMsg, String studentName, String formattedPercentage){
        String message = String.format("congratulation, %s has obtained %s with %s percentage", studentName, displayMsg, formattedPercentage);
        System.out.println(message);
    }

    public static void markDisplay(float a, float b, float c, float d, float e){
        System.out.println("Maths: " +a);
        System.out.println("Physics: " +b);
        System.out.println("Material: " +c);
        System.out.println("Computer: " +d);
        System.out.println("Drawing: " +e);
        System.out.println("========================");
    }
}