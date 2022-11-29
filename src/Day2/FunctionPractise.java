package Day2;

public class FunctionPractise {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        addition(a,b);

        int c = 90;
        int d = 80;
        subtraction(c,d);

        int e = 5;
        int f = 4;
        int result = multiplication(e,f);
        System.out.println(result);

        int g = 20;
        int h = 5;
        int result1 = division(g,h);
        System.out.println(result1);
    }

    public static void addition(int x, int y){
        int sum = x + y;
        System.out.println(sum);
    }

    public static void subtraction(int x, int y){
        int sub = x - y;
        System.out.println(sub);
    }

    public static int multiplication(int x, int y){
        int sum = x * y;
        return sum;
    }

    public static int division(int x, int y){
        int division = x / y;
        return division;
    }
}
