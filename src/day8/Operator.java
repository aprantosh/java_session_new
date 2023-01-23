package day8;

public class Operator {

    public static void main(String[] args) {
        // assignment operator
        int a = 4;

        // combining assignment operator with arthemetic

        float b = 8;
        b = b + 5;
        b = b + 7;
        //yaslai better way maa yasari lekhna sakinchha
        b += 8;
        b *= 2;
        b /= 3;
        b -= 4;

        //System.out.println(b);


//        increment and decrement operator

        int aIncrement = 5;
        aIncrement +=10;
        aIncrement --;
        aIncrement++;
        //System.out.println(aIncrement);
        //System.out.println("The value of the aIncrement++ is",int q);
        //System.out.println(w);

        int i = 0;
        ++i;
        i++;
        //System.out.println(i);

        int m = 5;
        int n = 6;
        int mul = n * ++m;
        int mul1 = n * m++;
        System.out.println(mul);
        System.out.println(mul1);

    }

}