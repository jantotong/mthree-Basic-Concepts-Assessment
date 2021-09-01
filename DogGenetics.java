import java.util.*;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percentage = 100;
        //12 Dog breeds
        String [] dogBreeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman", "Sush", "Hondi", "Roota", "Heeyera", "Woerrer", "Mordiraiser", "Beesin"};
        Random rng = new Random();
        ArrayList<Integer> breedsChosen = new ArrayList<>();
        System.out.println("What is dog name?");
        String dogName = sc.nextLine();
        System.out.println("Numbers of ancestors to show: ");
        int ancestors = Integer.parseInt(sc.nextLine());

        while(breedsChosen.size() != ancestors){ //Populate breedsChosen with random indexes of ancestors
            int randomNumb = rng.nextInt(dogBreeds.length);
            if(!breedsChosen.contains(randomNumb)) { //Make sure it doesn't contain same number
                breedsChosen.add(randomNumb);
            }
        }

        System.out.println("Well then, I have this highly reliable report on " + dogName +"'s prestigious background right here.");
        System.out.println(dogName + " is:");

        for(int i = 0; i < ancestors-1; i++){ //Loop to assign a value to each breed
            int tempPercent = rng.nextInt(percentage+1); //Generate a number within remaining percentage
            System.out.printf("%d%% %s\n", tempPercent, dogBreeds[breedsChosen.get(i)]);
            percentage -= tempPercent; //Remove percentage used for this iteration's dog breed
        }

        System.out.printf("%d%% %s\n", percentage, dogBreeds[breedsChosen.get(breedsChosen.size()-1)]); //Let the last dog breed get remaining percentages

        System.out.println("Wow, that's QUITE the dog!");
    }
}
