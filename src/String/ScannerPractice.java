package String;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {


        System.out.println("Welcome");

        String name = "David";
        System.out.println("My name is "+ name);


        // creating Scanner object

        Scanner input = new Scanner (System.in); //this is syntax on how to create scanner


        System.out.println("please enter your last name");
        //String lastname;// can declare first, then initialize late
        String lastname = input.nextLine();
        System.out.println(lastname);


        System.out.println("Enter you city");
        String city = input.nextLine();
        System.out.println(name + ""+ lastname + " you are living in " + city);

        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println(name + "your age is very good age");


        System.out.println("Please enter your height in feet and inches( i. e.: 5.8)");
        double height = input.nextDouble();
        System.out.println("your height is " + height);

        // input = new Scanner (System.in)
        // input.nextLine();
        input = new Scanner(System.in);

        System.out.println("Please enter your address");
        String address = input.nextLine();
        System.out.println("Is this a correct address you provided? " + address);


    }















}
