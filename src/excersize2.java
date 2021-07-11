import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
/*
This program is used for multiplying or adding two numbers and finding the answer.

 */
public class excersize2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input one integer");
        int input = sc.nextInt();
        System.out.println("next integer");
        int input2 = sc.nextInt();
        int sum = input + input2;
        System.out.println("answer is " + sum);

//        System.out.println("input one number");
//        double input = sc.nextDouble();
//        System.out.println("next number");
//        double input2 = sc.nextDouble();
//        double sum = input * input2;
//        System.out.println("product is " + sum);

        if (sum > 100) {
            System.out.println("product is greater then 100.");
        } else {
            System.out.println("product is not greater then 100.");
        }
    }
}
