import java.util.Scanner;

public class StringExersize {
    public static void main(String[] args) {
        // this is used to create a new scanner for the input of people
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a string of words");
        String originalInput = sc.nextLine();    //this is used to allow the person to write a string
        System.out.println(originalInput);
        System.out.println("Will modify this line");
        int indexOfFirstSpace = originalInput.indexOf(" ");    //this is used to cut the first word from the next by finding where the first space is
        String modifiedLine = originalInput.substring(0, indexOfFirstSpace);
        String capitalModifiedLine = modifiedLine.toUpperCase();     // like the code says, this is used to turn the first word to uppercase
        String modifiedTwoLine = originalInput.substring(indexOfFirstSpace);
        System.out.println("Modified line: " + capitalModifiedLine + modifiedTwoLine);


    }
}
