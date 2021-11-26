package Primitives;

public class TrueTable2 {
    public static void main(String[] args) {

        int  reqchildAge= 6;
        int  reqchildH= 48;

        int actualAge=5;
        int actualH=60;

        boolean isFree= reqchildAge >= actualAge || reqchildH >= actualH;

        System.out.println("Can ths child attend this even for free? " + isFree);

//=======================

        int reqAtten = 80;
        int test1 =0;
        int test2 =100;
        int test3 =90;



        int average = ((test1+test2+test3)/3);


        int reqtest = 70;

        int actualatten = 90;


        boolean pass = actualatten >=reqAtten && reqtest >= average;

        System.out.println("Did the student pass? " + pass);












    }

















}
