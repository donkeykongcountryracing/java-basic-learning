import java.util.Scanner;

public class circleAreaPerimeterExc {
    public static void main (String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("type one number");
        double input= sc.nextDouble();
        System.out.println("area is "+Math.PI*input*input);
        System.out.println("perimeter is "+Math.PI*input*2);

    }
}
