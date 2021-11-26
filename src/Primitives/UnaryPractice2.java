package Primitives;

public class UnaryPractice2 {

    public static void main(String[] args) {

        int a=7;
        int b=4;

        int result= --a + --b + a++ *2 - b++ * a--;

      //  int result= 6 + 3 + 6 * 2 - 3 * 7;

        System.out.println(result);
        System.out.println(a);
        System.out.println(b);


        int price = 2;
        int count = 12;

        int price2=2;

        int total=price;

        System.out.println(price *12 - --price);
 //======
        System.out.println(price2-- *12 - --price2);



        char ch = 'a';
        System.out.println(--ch);

        System.out.println(ch);
        System.out.println(++ch);
        ch++;
        ++ch;
        System.out.println(ch);
        System.out.println(--ch);













    }














}
