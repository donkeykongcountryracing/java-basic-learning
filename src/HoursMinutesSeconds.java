import java.util.Scanner;

public class HoursMinutesSeconds {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("type a number of seconds");
        int x = sc.nextInt();
        int minutes=x/60;
        int seconds = x-minutes*60;
        int hours= minutes/60;
        int minutesHours= minutes-hours*60;
        System.out.println(hours+" : " +minutesHours+" : "+seconds);





    }
}
