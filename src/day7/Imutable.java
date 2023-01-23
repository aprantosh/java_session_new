package day7;

public class Imutable {

    //immutable class ko sabai value constant hunu parchha

    private final String a;
    private final String b;

    public Imutable(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }
}
