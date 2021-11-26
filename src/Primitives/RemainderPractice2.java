package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {

        int myNumber = 456;

        int digit3= myNumber%10; //6
        myNumber=myNumber/10; //45

        int digit2= myNumber%10;//5
        myNumber=myNumber/10;//4

        int digit1=myNumber%10; //4

        System.out.println(digit3);
        System.out.println(digit2);
        System.out.println(digit1);

        System.out.println(digit1*digit2*digit3);













    }








}
