package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {



        //.toLowerCase (); == makes all the letters lower case
        //.toUpperCase (); == makes all the letters upper case

        String str = "jack";
        str.toUpperCase();
        // if we don't reassign the string
        // it will not change its value
        System.out.println(str);
        //jack,not JACK

        str = str.toUpperCase();
        System.out.println(str);


        Scanner scanner = new Scanner(System.in);

        System.out.println("enter you name");
        String name = scanner.next();

        System.out.println("enter you last name");
        String last = scanner.next();

        System.out.println(name.toLowerCase() + " " + last.toUpperCase());

        System.out.println(name);// If I apply methodin print out parenthesis it will print the values with method applied
       // when we use .nextLine () we can enter multiple words
        // when use .next it will not take more than one word














    }














}
