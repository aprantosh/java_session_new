package day8;

public class PrimitiveConversion {

    public static void main(String[] args) {
        //implicit conversion
        byte a = 9;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f  = e;


        //explicit conversion
        double a1 = 7.8;
        float a2 = (float) a1;
        long a3 = (long) a2;
        int a4 = (int) a3;
        short a5 = (short) a4;
        byte a6 = (byte)a5;

        char a7 = 'B';  //char can be converted into integer
        int a8 = (int) a7;
        System.out.println(a8);

        int b9 = 87;
        char c10 = (char) b9;
        System.out.println(c10);


        int add = (int) (2 + 7.8);
        System.out.println(add);
    }
}