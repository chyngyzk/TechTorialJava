package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        // BMI calculation = weight(kg) / (height * height(meter))
        // 18-24
        //"your BMI is <BMI>"

        Scanner project = new Scanner (System.in);

        System.out.println("Welcome");

        System.out.println("Please enter your weight in kg");
        double weight = project.nextDouble();

        System.out.println("Please enter your height");
        double height = project.nextDouble();

        double weight1 = 54;
        double height1 = 1.8;

         double result = weight1/(height1 * height1);
        System.out.println("your BMI is " + result);



















    }
















}
