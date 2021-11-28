package String;

import java.util.Scanner;

public class Methods5 {
    public static void main(String[] args) {

        String word = "Sunday";

        //replace ();

        String update = word.replace('a', '$');

        System.out.println(update);

        String updateWord = word.replace("Sun", "Satur");
        System.out.println(updateWord);
        System.out.println(word.replace("day", "*"));

        String code = "java";
        System.out.println(code.replace('a', '%'));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide your gender, fullname, year in this format F - Jenny Brown - 1999");

        String name = scanner.nextLine();




        System.out.println("Does the name start with F? " + name.startsWith("F"));
        System.out.println("Does the name end with M? " + name.endsWith("M"));
        System.out.println("Does the name contain my name? " + name.contains("Chyngyz"));
        System.out.println(" Is the year 2000?" + name.endsWith("2000"));
        System.out.println(name.replace('-', '/'));




    }








}
