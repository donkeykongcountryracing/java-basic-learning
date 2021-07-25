import java.util.Locale;
import java.util.Scanner;

public class CapitalLetterOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type a sentence");
        String usersSentence = sc.nextLine();

        String[] sentence = usersSentence.split(" ");
        for(int i=0;i<sentence.length;i++) {
            String CapitalLetter=sentence[i].substring(0,1).toUpperCase();
            String LaterSentcne= sentence[i].substring(1);
            System.out.print(CapitalLetter+LaterSentcne+" ");
        }
        //this is the more effeicient code and holds same properties as the hidden code below, the regex finds all of the spaces and splits it into
        // seperate columns but in the same array. So the 0'st array is the first string that s then ended by a space and the 1st anrray is the
        //next string that is surrounded by spaces. the sentence is split into different parts of an array each time a regex(regular expression)
        //occurs. and then multiple parts of an array are created. then the sentence.length( which is the array length) is the maximum for the
        //for loop range. then the sentence[i] (which is a word based what number i is because i shows which position the word is at in the array)
        // is split into caps and no caps and latter phrase. Basically the same as the bottom code but much shorter.



//
//        while (usersSentence.indexOf(" ") != -1) { // You could have used !=, which is the sign for not equal to
//            int positionOfFirst = usersSentence.indexOf(" ")+1;
//            String NewSentence = usersSentence.substring(0, positionOfFirst);
//            String capitalLetter = NewSentence.substring(0, 1).toUpperCase();
//            String laterPart = NewSentence.substring(1);
//            System.out.print(capitalLetter + laterPart);
//            usersSentence = usersSentence.substring(positionOfFirst);   // i substring the user sentence here so the length of the sentence updates when the
        // while loop is looped again, and so we can substring the while loop without scanning the first space and substringing the first word again
//        }
//        String FinalCapital = usersSentence.substring(0, 1).toUpperCase();
//        String FinalLaterPart = usersSentence.substring(1);
//        System.out.print(FinalCapital + FinalLaterPart);
    }
}
