import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type one number");
        int original = sc.nextInt();
        //% is divide sign but it finds what the remainder of the equation is not the answer
        if (original % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }

}

