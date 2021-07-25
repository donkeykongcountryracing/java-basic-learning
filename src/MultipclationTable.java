import java.util.Scanner;

public class MultipclationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type one integer");
        int originalinput = sc.nextInt();
        System.out.println(originalinput);
        for (int x = 1; x < 11; x++) {
            System.out.println(originalinput + " x " + x + " = " + originalinput * x);
        }
    }
}
