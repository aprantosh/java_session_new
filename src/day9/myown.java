package day9;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Locale;

public class myown {

    public static void main(String[] args) {

        String msg = " HI" + " Welcome" + " to" + " Java";
        //System.out.println(msg);


        StringBuilder mesgMan = new StringBuilder();
                mesgMan.append(" hi");
                mesgMan.append(" hello");
                mesgMan.append(" Welcome");
                mesgMan.append(" lops");

                String finalWord = mesgMan.toString();
                //System.out.println(finalWord);
                String finalWod = " Prantosh".repeat(4);
                //System.out.println(finalWod);



//
//        String a1 = "Hello";
//        String a2 = "World";
//
//        System.out.println(a1 == a2); //never use this
//        System.out.println(a1.equals(a2));
//            String a3 = a1.toLowerCase();
       //     System.out.println(a3);
     //   System.out.println(a2.toUpperCase());
//
////        //garbage collecter call garnu paryo vane use this syntax
////         System.gc();

         String a1 = "Hel";
        String a2 = "Hal";

//        String printA3 = a2.substring(0,10);
//        System.out.println(printA3);
//        System.out.println(a1);
//        String printA4 = a2.substring(0,5);
//        System.out.println(printA4);
//
//        System.out.println(a1.equals(printA4));
//        System.out.println(a1==printA4);
//        boolean a6 = a1 == a2 ;
//        System.out.println(a6);
//
//
//
//        System.out.println(a1.equals(printA3));
//
//        System.out.println(a2.charAt(8));
//        System.out.println(a1.charAt(4));

//        int comparedResult = a1.compareTo(a2);
//        System.out.println(comparedResult);
////
//        int comparedResult1 = "a".compareTo("A");
//        System.out.println(comparedResult1);
//
//        int comparedResult3 = "a".compareToIgnoreCase("A");
//        System.out.println(comparedResult3);
////
//        String h = "hello";
//        String i = " world!!";
//
//        String c = h + i + " Thanks";
//        System.out.println(c);
//
//        String combined = h.concat(i).concat(" never mind");
//        System.out.println(combined);
//
//
//        Scanner scanner = new Scanner(System.in);
//       String user = scanner.next();
//       System.out.println(user.concat(" welcome to the java world!!"));
//        System.out.println(user);
//
//        String result = String.format("welcome to the java world, %s", user);
//        //System.out.println(result);
//
//        boolean checkWord = result.contains("java");
//        System.out.println(checkWord);
//
//         System.out.println(result.indexOf("c"));
//
//        String t1 = "";
//        String t2 = "     ";
//        System.out.println(t1.isBlank());//space count garchha
//        System.out.println(t1.isEmpty()); // value kei pani hunu hudaina
//        System.out.println(t2.isBlank());
//        System.out.println(t2.isEmpty());
//
 //       String pran = ("abcdefghhj     ");
//        String tosh = ("");
//        System.out.println(pran.isEmpty());
//        System.out.println(tosh.isEmpty());
//        System.out.println(pran.indexOf("a"));
//        System.out.println(pran.replace("h","i"));
  //      System.out.println(pran);

//
//        String response = "rat;car;bus;hall";
//        String updatedResponse = response.replace(";",",");
//        System.out.println(updatedResponse);
////
//              String[] responseSplit = response.split(";");
//              System.out.println(Arrays.toString(responseSplit));
//              System.out.println(responseSplit);

//        String policy = "0000601,A,4000;0.0000602,S,7000;0000603,Q,3000";
//        //String[] splittedPolicy = policy.split(";");
//        String[] splittedPolicy = policy.split(",",3);
//
//        System.out.println(splittedPolicy[0]);
//        System.out.println(Arrays.toString(splittedPolicy));

//        String[][] array_name = {
//                {"valueR1C1", "valueR1C2"}, {"valueR2C1", "valueR2C2"}
//                           };
//        System.out.println(Arrays.toString(array_name));
//        String account1 = "saving";
//        String account2 = "Saving";
//
//        String accType1 = account1.toUpperCase();
//        String accType2 = account2.toUpperCase();
//
//        System.out.println(accType1);
//        System.out.println(accType2);


       // conversion
        //int a = (int) 2.4f;

//        String b = String.valueOf(2.4f);
//        System.out.println(b);
//        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
//
//        String practice = "taman neupane";
//        String cap = practice.substring(0, 1).toUpperCase() + practice.substring(1);
//        String cap1 = Character.toUpperCase(practice.charAt(0)) + practice.substring(1);
//        System.out.println(cap);
//        System.out.println(cap1);
//
//        String test = "hello world!!!";
//        String cap = test.substring(0,1).toUpperCase();
    }
}
