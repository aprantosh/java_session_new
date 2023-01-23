package day19;

import java.util.ArrayList;

public class AutoBoxing {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(0);
        ints.add(1);
        ints.add(2);
        ints.add(3);
        int i = ints.get(2);
        System.out.println(i);

        int amount = Integer.valueOf("2000");


        int d = 2;
        String e = String.valueOf(d);


    }

}