package day14;

import java.util.Arrays;

public class ArrayProperty {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,2,4,3};
//        System.out.println(Arrays.toString(a));
//        randomFunction(a);
//        System.out.println(Arrays.toString(a));

        // array function maa pass garda copy of array pathaune.. reason- value pass garna hoina reference pass garna
        int[] copyOfA = Arrays.copyOf(a,a.length-4);
        randomFunction(copyOfA);
        System.out.println(Arrays.toString(copyOfA));

        //arrange garnalai use hune important function
            Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    }

    public static void randomFunction(int[] a){
        a[0] = 8;
    }
}