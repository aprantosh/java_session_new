package day14;

import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        String[] names = {"hello", "world"};

        String[] copyOfNames = Arrays.copyOf(names,3);
        String value = copyOfNames[0];
        System.out.println(value);
    }
}