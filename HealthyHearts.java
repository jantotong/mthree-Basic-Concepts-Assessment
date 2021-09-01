import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = Integer.parseInt(sc.nextLine());
        int maxHeartBeat = 220-age;
        System.out.println("Your maximum heart rate should be "+ maxHeartBeat +" beats per minute");
        System.out.printf("Your target HR Zone is %d - %d  beats per minute", Math.round(maxHeartBeat*.5), Math.round(maxHeartBeat*.85)); //Rounds up heartbeat number
    }
}