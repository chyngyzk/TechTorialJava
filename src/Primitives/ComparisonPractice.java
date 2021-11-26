package Primitives;

public class ComparisonPractice {

    public static void main(String[] args) {

        float fl = 4; // 4.0f is the same as 4.0, because it's the same value
        int i = 4;


        // option one System.out.println (fl == i);
        // option two:
        boolean comp1 = fl == i;


        System.out.println(18 == 18);

       // System.out.println('a' == "a"); not compiling
        //System.out.println("test" = "tesT"); //false because of capital T at the end

        // !=  --> if two values are not the same

         // 5 != 6 --> if the values are NOT the same it will return true
       //            --> if the values are SAME it will return true

        int num1 = 55;
        int num2 = 66;

        boolean comp2 = num1 !=num2; //true

        System.out.println(18 != 18); //false
        // < less than

        System.out.println(num1 < num2); //true
        System.out.println(55 < num1); //false 55< 55
        System.out.println(num2 < num1); //false
        System.out.println('c'<'c');//false
        System.out.println('c'< 'd'); //true
// >greater tban

        System.out.println(num2++ > 66);//false
        System.out.println(num2 > 66);//true

        // <=  less than or equals

        num1=2; num2=3;

        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);

        num1++;
        System.out.println(num1 <= num2 );//true
        System.out.println(++num1 < ++num2);

        // >=   greater than or equals

        System.out.println(num2 >= num1);
        System.out.println(7 >= ++num1 + num2); //false












    }








}
