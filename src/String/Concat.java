package String;

public class Concat {

    //
    public static void main(String[] args) {



        String number= "1";
        number+="2";
        number+=2;
        System.out.println(number); //122 is the outcome, because the problem started with string and the rest will be string as well

        //String has built in methods/functions you can call by using your variable

        String test = "Chicago";

        //int num=5; //primitives don't have methods like num.

        test = test.concat(" is the best"); //always assign the concat
        test = test.concat (" in the summer"); //Chicago is the best in the summer
        System.out.println(test);

        test += test.concat (" EVER");//Chicago is the best in the summerChicago is the best in the summer EVER

        System.out.println(test);

        String str = "just do it";
        System.out.println(str);

        String str1 = new String(" whatever it takes");

        System.out.println(str1);
        System.out.println(str + str1);





    }














}
