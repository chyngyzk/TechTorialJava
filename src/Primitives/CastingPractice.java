package Primitives;

public class CastingPractice {

    public static void main(String[] args) {

        int number1 = 23;
        long l1 =number1; //implicit casting (happens by java)

        short sh1 = (short) number1; //explicit casting (short)


        byte by1 =1;
        byte by2 =2;
       //short sum1= by1 + by2; not going to compile

        short sum2= (short) (by1 + by2);
        // short sum3 = (short) by1 + (short) by2; this is still individual casting for each variable, result is not casted yet

        int price = (int) 750.99;
        System.out.println(price);

        double samsung = 900.45;
        int priceSamsung = (int) samsung;
        System.out.println("Samsung" + samsung);
        System.out.println("Price Samsung in int" + priceSamsung);












    }











}
