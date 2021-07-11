import java.util.Scanner;

public class homewordOne {
    public static void main(String[] args) {
        // 1. Get the scanner ready

        // 2. make the scanner read the input. scanner.nextLine()

        // 3. input.replaceAll("a", "A");

        // 4. print the modified string
        Scanner sc = new Scanner(System.in);
        System.out.println("type a sentence");

        String originalInput = sc.nextLine();

        String newInput = originalInput.replaceAll("a", "A");
        System.out.println("new sentence is: " + newInput);


    }
}
