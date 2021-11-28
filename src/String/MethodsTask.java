package String;

import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {
        // -Task: get string from user
        //	print first, last, middle, second matching 'c', lenght, index of x

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string value");
        String str= scanner.nextLine();

        System.out.println("The first letter is " + str.charAt(0));
        System.out.println("The last letter is "+ str.charAt(str.length()-1));
        System.out.println("Middle char is " + str.charAt(str.length()/2));

        System.out.println("Second matching c's index number is " + str.indexOf("c", str.indexOf('c')+1));
        System.out.println("The length of the string is "+ str.length());
        System.out.println("The index of 'x' is " + str.indexOf("x"));





        System.out.println();















    }










}
