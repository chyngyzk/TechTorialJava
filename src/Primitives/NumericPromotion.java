package Primitives;

public class NumericPromotion {

    public static void main(String[] args) {

        byte b1 = 3;

        short sh1 =b1;

        short sh2 = sh1;

      //  byte b2 = sh2; compile time error, you cannot store larger data type into smaller data type

      //  short result= b1+sh2; compile time error

        byte b2=2;

       // byte result2= b1+b2; compile time error
        int result2= b1+b2; //  numeric promotion happens and java promotes smaller data types to int



        int i1 =4;


        double d1 =i1;
        // int i2=d1; compile time error

        float f1=1.2f;
        float f2=3.4f;

       float result3= f1+f2; // bigger than integer and not a whole number

       double d3 = result3;

       //float f3=d3; //compile time error

        double d4 = 1.2;
        double result5= f1 +d4; //numeric promotion happens and java promotes to the larger data type



    }














}
