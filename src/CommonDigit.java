import java.util.Scanner;

public class CommonDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number");
        int x = sc.nextInt();
        System.out.println("Write a number");
        int y = sc.nextInt();
        String xChar = String.valueOf(x);
        String yChar = String.valueOf(y);
        char[] xArray = new char[2];
        char[] yArray = new char[2];
        if (x > 15 && x < 75 && y > 15 && y < 75) {
            for (int i = 0; i <= 1; i++) {
                xArray[i] = xChar.charAt(i);
                yArray[i] = yChar.charAt(i);
            }
        }//couldve done or (||)
        if (x > 15 && x < 75 && y > 15 && y < 75) {
            if (xArray[0] == yArray[0]) {
                System.out.println("true");
            } else if (xArray[0] == yArray[1]) {
                System.out.println("true");
            } else if (xArray[1] == yArray[0]) {
                System.out.println("true");
            } else if (xArray[1] == yArray[1]) {
                System.out.println("true");
            }
        } else {
            System.out.println("false");
        }
        //instead of doing array you could just susbstitute with char at


    }
}

