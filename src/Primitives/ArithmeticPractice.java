package Primitives;

public class ArithmeticPractice {

    public static void main(String[] args) {

        //addition --> +

        int num1 = 3;
        int num2 = 4;
        System.out.println("Total is:" +( num1+num2));

        int sum = num1+num2;

        System.out.println(sum);


        //subtraction --> -

        int difference;

        difference = 10 - num2;
        System.out.println("difference is = " + difference);


        //multiplication--> *

        double product = difference * num2;

        System.out.println(product);

        //division --> /

       double division = product / 3.0; //name is always has top be assigned to a primitive
        System.out.println(division);

        double division3 = 5/2d; // without d 2.0, with d 2.5 ----same for float (f)
        System.out.println(division3);

        //remainder --> left over --> % (modulus)

        int a =11;
        int b =5;

       int remainder1 = a % b;
        System.out.println("The left over of 11/5 is = " + remainder1);

        int x = 13;
        int y = 5;


        int remainder2= x%y;
        System.out.println(remainder2); //3

        System.out.println(25%x); //12















    }










}
