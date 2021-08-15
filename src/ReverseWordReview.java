import java.util.Scanner;

public class ReverseWordReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a string");
        String wordReverse = sc.nextLine();
        int lengthOfWord = wordReverse.length() - 1;
        char[] arr = new char[wordReverse.length()];

        for (int i = 0; i < wordReverse.length(); i++) {
            char character = wordReverse.charAt(i);
            arr[lengthOfWord] = character;
            lengthOfWord--;
        }
        System.out.println(arr);
        //maybe array, maybe split, maybe for loop,


    }

}
