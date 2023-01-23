package day6;

public class ShoppingMall {

    public static void main(String[] args) {

//        static ko laagi object banaunu pardaina, sidhai class baata call garna milchha

        Door.increaseCounter();
        Door.increaseCounter();
        Door.decreaseCounter();

        System.out.println(Door.getCounter());
        System.out.println(Door.getCounter());
        System.out.println(Door.getCounter());
        System.out.println(Door.getCounter());

    }
}