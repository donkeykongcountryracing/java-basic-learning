import java.util.Scanner;

public class CapitalLetterOfEachWord {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("type a sentence");
        String usersSentence= sc.nextLine();

        int i=0;

        while (usersSentence.indexOf(" ")>0) {
            int positionOfFirst = usersSentence.indexOf(" ")+1;
            String NewSentence = usersSentence.substring(i,positionOfFirst);
            String capitalLetter=NewSentence.substring(0,1).toUpperCase();
            String laterPart=NewSentence.substring(1);
            System.out.print(capitalLetter+laterPart);
            usersSentence = usersSentence.substring(positionOfFirst);
        }
        String FinalCapital=usersSentence.substring(0,1).toUpperCase();
        String FinalLaterPart=usersSentence.substring(1);
        System.out.print(FinalCapital+FinalLaterPart);
    }
}
