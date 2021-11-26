package Primitives;

public class UnarayPractice1 {

    public static void main(String[] args) {


       // int studentNumber =25;
    //   System.out.println(studentNumber);

       // studentNumber = studentNumber++;
       // System.out.println(studentNumber);

      //  studentNumber = studentNumber++;
       // System.out.println(studentNumber);

     //   studentNumber = ++studentNumber;
     //   System.out.println(studentNumber);

      int count = 5;

       System.out.println(count++); //it's 6, showing us 5, post-increment increases only after you re-use the variable name it.
       System.out.println(++count); //7

        int studentNumber=25;
        System.out.println(studentNumber++); //shows 25 but it is 26
        System.out.println(studentNumber); //shows 26

        studentNumber++;

        System.out.println(studentNumber); //27 because of line 29



        int count2 =5;
        System.out.println(++count2);
        System.out.println(count2++); //shows 6 it is 7


        //=================

        int number =8;
        System.out.println(number--);//shows 8 , it is 7
        System.out.println(number--); //shows 7 it is 6

        System.out.println(--number); //shows 5 it is 5

        number++;
        System.out.println(number++ + number++); //result 13
        System.out.println(number); //number is 8

            int result= --number + --number +2 - number ++ *2;

        System.out.println(result); //the result is 3
        System.out.println(number);//the number is 7

        //================

        int a =++number;
        System.out.println(a);





    }



}
