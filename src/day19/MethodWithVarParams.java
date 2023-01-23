package day19;

import java.util.Arrays;

public class MethodWithVarParams {
    public static void main(String[] args) {
        String.format("hello my name is %f", "ram");

        add(2,3);
        add(3,4,5);
    }

    public static void add(int a,int b){

    }

    public static void add(int... values){
        System.out.println(Arrays.toString(values));
        int sum = 0;
        for (int val: values) {
            sum+=val;//sum = sum + value
        };
        System.out.println(sum);

//        easiest approach
        int sum1 = Arrays.stream(values).sum();
        System.out.println(sum1);
    }
}