package String;

public class Methods6 {
    public static void main(String[] args) {


        String name = "         Techtorial Academy     "     ;
        //trim() --> it will remove spaces before and after string

        String updatedName = name.trim();
        System.out.println(updatedName);
        System.out.println(name);

        //subString(); --> cut your string in part

        String part1 = updatedName.substring(4);
        System.out.println(part1);

        String part2 = updatedName.substring(4,12); //ending index is not included
        System.out.println(part2);














    }





















}
