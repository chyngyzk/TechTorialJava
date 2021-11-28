package String;

public class Methods2 {

    public static void main(String[] args) {


        String flower = "Rose";
        int indexR = flower.indexOf('R');
        int indexR1 = flower.indexOf("R");

        System.out.println("first implementation "+ indexR);
        System.out.println("second implementatiton " + indexR1);


        System.out.println(flower.indexOf("o")); //1
        System.out.println(flower.indexOf("os")); // 1 because of the first matching letter
        System.out.println(flower.indexOf("o,s")); // -1 because it cannot find matching char

        System.out.println(flower.indexOf('r')); //-1 because the letter doesn't match

        System.out.println(flower.indexOf("Rose")); //0


        String object = "umbrellam";

        System.out.println(object.indexOf("l")); //5
        System.out.println(object.indexOf('l', 6)); //6, meaning l after index 6
        System.out.println(object.indexOf('m', object.indexOf('m')+1)); //8
        System.out.println(object.length());

        System.out.println(object.indexOf('r'));
        String sentence = "I love lilies";
        System.out.println(sentence.indexOf('l', sentence.indexOf('i')));

        // toUppercase() --> makes you string as Uppercase
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);

        System.out.println(sentence.toLowerCase());

        String str = "Just do it";

        //indexOf --> returning number
        //charAt --> returning char

        char letter =  str.charAt(str.indexOf("d"));
        String str2 = "";//reassigning a char to a string
        str2 += letter;
        System.out.println(str2.toUpperCase());




    }













}
