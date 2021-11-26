package String;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your first name");
        String name = scanner.nextLine();


        System.out.println("Enter DOB");
        long dob = scanner.nextLong();

        long age = 2021 - dob;


        System.out.println("You're  " + name + " and you're "+ age);


        















    }











}
