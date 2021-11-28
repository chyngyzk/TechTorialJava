package String;

import java.util.Scanner;

public class ScannerPractice6 {
    public static void main(String[] args) {
//        create a new class: MoneyTransaction
//        David wants to deposit his paychecks into his account and already has $200
//        He has 3 paychecks (610, 385, 975)
//        he can only deposit one check at a time
//                *Ask: "How much is Deposit amount?" every time he is making deposit
//        after all of pay checks deposited in to account
//        he bought a phone for $599 and headphone for $299
//                *Ask: How much is phone?
//	*Ask: How much is headPhone?
//        Calculate his final money and print --> "Your final balance is <finalAmount>"
        Scanner scanner = new Scanner(System.in);

        int  balance1 = 200;

        System.out.println("deposit 1");
        int deposit1 = scanner.nextInt() ;
        balance1+=deposit1;

        System.out.println("deposit 2");
        int deposit2 = scanner.nextInt() ;
        balance1+=deposit2;


        System.out.println("deposit 3");
        int deposit3 = scanner.nextInt() ;
        balance1+=deposit3;



        System.out.println("Phone");
        int iphone = scanner.nextInt();
        balance1 -= iphone;

        System.out.println("Headphones");
        int headphones = scanner.nextInt();
        balance1 -= headphones;

        System.out.println("Ending balace " + (balance1));









    }







}
