package String;

import java.util.Scanner;

public class ScannerPractice5 {
    public static void main(String[] args) {

        // when we use .nextLine () we can enter multiple words
        // when use .next it will not take more than one word
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //I can provide as many words as I want to.
        System.out.println(str);
        String str1 = scanner.next();
        //For this i cannot provide more than one word
        System.out.println(str1);













    }









}
