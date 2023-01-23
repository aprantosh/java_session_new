package day14;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arrays1 = {1,2,3,4};
        int[] arrays2 = {6,7,8,9,};

        //size of array has been declared below
        String[] names = new String[3];


        //System.out.println(Arrays.toString(arrays1));

        names[1] = "pran";
        names[0]="abc";
        names[2]="xyz";
        //System.out.println(Arrays.toString(names));

        String value = names[1];
        //System.out.println(value);

//        int length = names.length;
//        for (int i = names.length-1; i >= 0; i--){
//            String value1 = names[i];
//            System.out.println(value1);
//        }
//
//        //enhanced for loop
//        int index = 0;
//        for (String name:names) {
//            System.out.println(name);
//            //index find out garne
//            System.out.println(index);
//            index ++;
//        }
////
        int[] scope = new int [10];
        Arrays.fill(scope,22);
        System.out.println(Arrays.toString(scope));



    }
}