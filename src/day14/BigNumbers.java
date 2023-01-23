package day14;

import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        long value = 999999999;

        BigInteger bigValue = BigInteger.valueOf(value);

        BigInteger bigValue1 = new BigInteger("199999999999999888888888888");
        System.out.println(bigValue1);
        //one biginteger can only be added to another bigInteger, see the example below

        BigInteger bigValue2 = new BigInteger("2");

        BigInteger sum = bigValue1.add(bigValue2);
        System.out.println(sum);

        //if you want to add just 1, see the example below
        BigInteger sum2 = bigValue1.add(BigInteger.valueOf(1));
        System.out.println(sum2);

        BigInteger p = new BigInteger("1111111111");
        BigInteger t = new BigInteger("2222222222");
        BigInteger r = new BigInteger("3333333333");

        //similarly we can use BigDecimal etc...
        BigInteger dividedBy = BigInteger.valueOf(100);

        BigInteger result = (p.multiply(t).multiply(r)).divide(dividedBy);
        System.out.println(result);

        //negative number check garnalai pani yasto case use garne
        BigInteger negativeNum = BigInteger.valueOf(-2);

        if(negativeNum.signum() == -1){
            // it returns -1 for negative number
            //0  for 0
            //1 for positive
            System.out.println("negative");
        } else if (negativeNum.signum() == 1) {
            System.out.println("positive");
        } else {
            System.out.println("value is zero");
        }


    }
}