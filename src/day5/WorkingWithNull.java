package day5;
import day4.Weather;
import day1.Address;
import day1.BankAccount;

import java.util.Objects;

public class WorkingWithNull {
    public static void main(String[] args) {

//        BankAccount prantoshAccount = new BankAccount();//dont use this way of creating an object inorder to avoid null point
        //point exception

//        Address address = null;

        Address address = new Address("CountryName", "StateName", null, "StreetName");
        Weather weather = new Weather("25degree","mild" , "SOur", "Heavy");
        BankAccount prantoshAccount = new BankAccount("534354", null, 20, address, "12/12/2020", "haltom", "1212112");
        Gadgets prantoshgadgets = new Gadgets("Phone", "Apple", 14000, "Amoled");
       /* System.out.println(prantoshAccount.getBalance());
        System.out.println(prantoshAccount.getAccountNumber());
        System.out.println(prantoshAccount.getAddress());
        System.out.println(prantoshAccount.getAccountOwner());*/
        System.out.println(prantoshgadgets.getType());
        System.out.println(prantoshgadgets.getDisplay());
        System.out.println(Weather.getRain());

        prantoshAccount.setAccountNumber("112233");

        int length = prantoshAccount.getAccountNumber().length();

        boolean isAddressNull = Objects.isNull(prantoshAccount.getAddress());
        System.out.println(isAddressNull);

        if (!isAddressNull) {
            String addressCity = prantoshAccount.getAddress().getCity();
            System.out.println(addressCity);
        }
    }

    public static class  Gadgets {
        private String type;
        private String Brand;
        private double Price;
        private String Display;

        public Gadgets() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBrand() {
            return Brand;
        }

        public void setBrand(String brand) {
            Brand = brand;
        }

        public double getPrice() {
            return Price;
        }

        public void setPrice(double price) {
            Price = price;
        }

        public String getDisplay() {
            return Display;
        }

        public void setDisplay(String display) {
            Display = display;
        }

        public Gadgets(String type, String Brand, double Price, String Display) {
            this.type = type;
            this.Brand = Brand;
            this.Price = Price;
            this.Display = Display;
        }
    }
}