package String;

public class Basics {
    public static void main(String[] args) {

       String word = "Tech";

        System.out.println(word);

        String word2 = new String("Tech");

        System.out.println(word2);

        String word3 = "Tech" + "Torial";
        System.out.println(word3);

        System.out.println(word + "JAVA");
        System.out.println(word);

        System.out.println(word + "77");

        System.out.println(word + 7 + 8);
        System.out.println(word + (7 -8));// would not compile without brackets

        System.out.println(word + 7 * 8);
        System.out.println(7+8 +word +7 +8);//15Tech78, if you start something with a string, the rest will be string.
                                            // That means the addition and subtraction will not work after the string
                                            // Keep in mind, the order of operations, multiplication/division will always go first
        word += "torial";

        System.out.println(word); //sout.  only shows, doesn't store the data

        word+=33;

        System.out.println(word);

        word+=33 + 11;
        System.out.println(word);


    }






















}
