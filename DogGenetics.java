import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percentage = 100;
        String [] dogBreeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        Random rng = new Random();

        System.out.println("What is dog name?");
        String dogName = sc.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName +"'s prestigious background right here.");
        System.out.println(dogName + " is:");

        for(int i = 0; i < dogBreeds.length-1; i++){ //Loop to assign a value to each breed
            int tempPercent = rng.nextInt(percentage+1); //Generate a number within remaining percentage
            System.out.printf("%d%% %s\n", tempPercent, dogBreeds[i]);
            percentage -= tempPercent; //Remove percentage used for this iteration's dog breed
        }

        System.out.printf("%d%% %s\n", percentage, dogBreeds[dogBreeds.length-1]); //Let the last dog breed get remaining percentages

        System.out.println("Wow, that's QUITE the dog!");
    }
}
