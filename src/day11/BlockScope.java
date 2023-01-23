package day11;

public class BlockScope {
    //    static int globalVariable = 5;
//
//    public static void main(String[] args) {
//        int localVaraible = 10;
//        {
//            int scopeVariable = 15;
//            localVaraible = 10;
//            globalVariable = 5;
//        }
//
//    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        add(a,b);
        mul(a,b);
        somethingLongWork();

        //two ways to call garbage collector.. but avoid using this function
        System.gc();
        Runtime.getRuntime().gc();
    }

    public static void add(int a, int b){
        int add = a + b;
    }

    public static void mul(int a, int b){
        int mul = a * b;
    }

    public static void somethingLongWork(){
        //some logic
    }
}