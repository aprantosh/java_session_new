package day7;

public class MutableImutablePractise {

    public static void main(String[] args) {

        Mutable mutable = new Mutable("a", "b");

        //System.out.println(mutable.getA());
        //System.out.printf(mutable.getB());

        mutable.setA("b");
        mutable.setB("a");

        System.out.println(mutable.getA());
        System.out.printf(mutable.getB());


        //immutable class yasmaa harek choti object banaunu parchha value assign garnalai

        Imutable imutable = new Imutable("a", "b");

        System.out.println(mutable.getA());
        System.out.printf(mutable.getB());

        Imutable imutable1 = new Imutable("c","d");

        System.out.println(mutable.getA());
        System.out.printf(mutable.getB());
        //localdate can be the example of immutable class

    }
}