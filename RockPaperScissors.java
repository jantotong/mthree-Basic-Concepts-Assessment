import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        String play = "yes"; //Used for play-again option

        while(play.equals("yes")) {
            
            //Counters
            int won = 0;
            int draw = 0;
            int lost = 0;
            
            System.out.println("How many rounds do you want to play? ");
            int rounds = Integer.parseInt(sc.nextLine());
            if (rounds > 10 || rounds < 1) { //If rounds are NOT within limits
                System.out.println("Please choose between 1 to 10 rounds!");
                return;
            }
            while (rounds > 0) { //Loop for rounds asked for
                System.out.println("Choose your move: (1 = Rock, 2 = Paper, 3 = Scissors)");
                int userPick = Integer.parseInt(sc.nextLine());
                int compPick = rng.nextInt(3) + 1; //Pick random number from 1 to 3
                if (compPick == userPick + 1 || (compPick == 3 && userPick == 1)) { //If user picks winning choice
                    System.out.println("Win!");
                    won++;
                } else if (compPick == userPick) { //If user and computer picks same choice
                    System.out.println("Draw!");
                    draw++;
                } else if (userPick == compPick + 1 || (userPick == 3 && compPick == 1)) { //If user picks losing choice
                    System.out.println("Lose!");
                    lost++;
                }
                rounds --;
            }
            
            System.out.printf("Games won: %d \nGames lost: %d \nGames drew: %d\n", won, lost, draw);
            
            //Compare stats and see did user or computer won
            if (won > lost) {
                System.out.println("Overall winner is user!");
            } else if (won == lost) {
                System.out.println("Overall it's a draw!");
            } else {
                System.out.println("Computer wins this time...");
            }
            
            //Ask user to play again
            System.out.println("Play again? (Yes or No)");
            play = sc.nextLine().toLowerCase();
        }
        System.out.println("Thanks for playing!");
    }
}
