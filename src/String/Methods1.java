package String;

public class Methods1 {
    public static void main(String[] args) {
        String device = "microphone";

        device.concat(" is an output device");
        System.out.println(device);


        char ch = device.charAt (1);
        System.out.println(ch);

       int letterCount = device.length(); //returns a number -->10

        System.out.println(letterCount);
        device += " is expensive"; //+ sign also means a concat
        System.out.println(device.length());

        device.concat (" device");

        System.out.println(device.length());

        device = device.concat (" device");
        System.out.println(device.length());

        System.out.println(device.charAt(29));//e

        String example ="Macbooks are the best laptops";

       char lastChar =  example.charAt(example.length()/-1);
        System.out.println(lastChar);



    }









}
