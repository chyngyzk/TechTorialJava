package String;

import java.util.Scanner;

public class CharPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Type your letter");

        //ASCII table
        //The table that all chars has a unique value
        //char a = 97;
        //char a2 = 'a';

        System.out.println("Please enter a char letter");
        char ch = 'A';
        //if this ch is a letter or not;
        // If the value of the char between char a and char z
        //it ,means this char is a letter
        boolean isLetter = ch>'a' && ch<='z' || ch>='A' && ch<= 'Z';
        System.out.println(isLetter);

















    }
















}
