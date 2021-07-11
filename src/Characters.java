import java.util.Locale;

public class Characters {
    public static void main(String[] args) {

        char a = 'a';
        char b = 16;
        char c = 97;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String intro = "Hello my name is cookie and you dont live in Hong Kong. you also go to HKIS and teach";
        String replaced = intro.replaceAll("cookie", "Ethan").replaceAll("you", "I").replaceAll("dont live", "live").replaceAll("teach", "study");
        System.out.println("Next is Ethan's intro: " + replaced);
        String intro2 = "bbb";
        intro2.replaceAll("b", "b");

        String name = "Ethan Jin";
        String firstName = name.substring(0, 5);
        String lastName = name.substring(6).toUpperCase();
        String newLastName = lastName.toLowerCase();
        System.out.println(firstName + " " + lastName);
        System.out.println(newLastName);

        String quotation = "\"hello\"\nhello java";
        System.out.println(quotation);


    }
}
