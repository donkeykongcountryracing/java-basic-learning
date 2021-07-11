import java.util.Scanner;

public class inputIndexOutput {
    public static void main(String[] args) {
//the project gets a word from the user and finds the index in the word of each letter in the alphabet and writes their location(A.K.A -1, 0, 1 in numbers)
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write one word");
        //this is used to get a word from the user
        String originalWord = sc.nextLine();

        for(char a=97; a<123; a++) {
            //this is the askii code and it is a loop which then adds one to show each alphabet going up(97=a, 97+1=b, 98+1=c) because you cant use add one alphabets
            int code = originalWord.indexOf(a);
            //index of "a" goes up by 1 and since a is in askii code the computer scans it as a letter so then they can see the index of the letter in the original word.
            System.out.println(code);
            //at the end of this it loops back up to for so it can then scan the next alphabet and see its position in the word it finally stops when a= 123 A.K.A Z


            //Do another code where you find the index of all a's in a string
        }
    }
}
