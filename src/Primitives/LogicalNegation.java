package Primitives;

public class LogicalNegation {
    public static void main(String[] args) {

        boolean isLightOn = true;

        System.out.println(isLightOn);

        System.out.println("1" +!isLightOn);

        System.out.println(5 == 5); //true

        System.out.println(!(5 == 5)); //false

        boolean haveMoney = false;

        haveMoney = !haveMoney;
        System.out.println(haveMoney);


        System.out.println(isLightOn ==haveMoney);
        System.out.println(!(isLightOn ==haveMoney));











    }










}
