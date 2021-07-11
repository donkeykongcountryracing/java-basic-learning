import java.util.Scanner;

public class asciicodeconverter {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("type a character");
        String input= sc.nextLine();
        char newinput= input.charAt(0);
        int askii = newinput;
        System.out.println(newinput);
        System.out.println("the askii value of "+newinput+" is: "+askii);

    }
}
