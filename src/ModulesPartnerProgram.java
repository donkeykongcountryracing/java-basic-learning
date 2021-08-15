import java.util.Scanner;

public class ModulesPartnerProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write two numbers");
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int division=input1/input2;
        int remainder=input1-division*input2;
        System.out.println(remainder);

    }
}
