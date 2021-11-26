package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice4 {

    public static void main(String[] args) {

        Scanner program = new Scanner (System.in);

        System.out.println("Please enter a number");
        int num1 = program.nextInt();

        // If remainder with 2 gives 0, this number will be even
        //otherwise it is odd

        boolean isEven = num1%2 == 0;
        System.out.println(num1 + " is even number " + isEven);

        //ask user to enter two integer number
        // first interger you provide should be bigger than second one;
        //if first number bigger than the second one
        //we will print out true

        System.out.println("Enter your first int number");
        int first= program.nextInt();

        System.out.println("Please enter an integer but smaller than first one");
        int second =  program.nextInt();

        boolean isFirstBigger = first > second;
        System.out.println(isFirstBigger);


        System.out.println("Atten");
        int atten = program.nextInt();

        System.out.println("grade");
        int grade= program.nextInt();



        System.out.println("homework");
        int homework = program.nextInt();

        boolean isPass = atten >=85 && grade >=80 && homework >=70;
        System.out.println(isPass);

















    }












}
