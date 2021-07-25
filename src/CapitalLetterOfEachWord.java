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
        //next string that is surrounded by spaces.

//
//        int i = 0;
//
//        while (usersSentence.indexOf(" ") != -1) { // You could have used !=, which is the sign for not equal to
//            int positionOfFirst = usersSentence.indexOf(" ")+1;
//            String NewSentence = usersSentence.substring(i, positionOfFirst);
//            String capitalLetter = NewSentence.substring(0, 1).toUpperCase();
//            String laterPart = NewSentence.substring(1);
//            System.out.print(capitalLetter + laterPart);
//            usersSentence = usersSentence.substring(positionOfFirst);
//        }
//        String FinalCapital = usersSentence.substring(0, 1).toUpperCase();
//        String FinalLaterPart = usersSentence.substring(1);
//        System.out.print(FinalCapital + FinalLaterPart);
    }
}
