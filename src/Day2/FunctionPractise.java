package Day2;

public class FunctionPractise {
    public static void main(String[] args) {
        int a = 15;
        int b = 2;
        addition(a,b);

        int c = 80;
        int d = 70;
        subtraction(c,d);

        int e = 3;
        int f = 5;
        int result = multiplication(e,f);
        System.out.println(result);

        int g = 20;
        int h = 10;
        int result1 = division(g,h);
        System.out.println(result1);

        float i =70;
        float j = 100;
        float result2 = percent(i,j);
        System.out.println(result2);
    }

    public static float percent(float x, float y) {
        float percent = x/y*100;
        //System.out.println(percent);
        return percent;
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
