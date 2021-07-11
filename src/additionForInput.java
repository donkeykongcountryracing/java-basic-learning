import java.util.Scanner;

public class additionForInput {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("type one integer");
        int n = sc.nextInt();
        int nn= n*10+n;
        int nnn= n*100+nn;
        int done= n+nn+nnn;
        System.out.println(n+" + "+nn+" + "+" + "+nnn+" = "+done);

    }
}
