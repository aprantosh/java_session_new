package day3;

public class PolimorphismTest {
    public static void main(String[] args) {
        add(4,9);
        add(5.5f,6.2f);
        add(4.5,6.3);
    }

    public static void add(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static void add(float a, float b){
        float sum = a + b;
        System.out.println(sum);
    }

    public static void add(double a, double b){
        double sum = a + b;
        System.out.println(sum);
    }
}