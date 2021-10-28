/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssessmentWeekOne;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Fishget
 */
public class DogGenetics {
    
    public static void DogDNA(String nameOfDog){
        int remainingPercentage =100;
        int maxPercentageAllow =96; // max 96 because there is 5 type of dog breeds
        int randomOnput;
        String[] dogBreeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman" };
        
        System.out.println(nameOfDog);
        System.out.print("Well then, I have this highly reliable report on Sir Fluffy McFlufferkins Esquire's prestigious background right here. ");
        Random rng = new Random();
        System.out.println(nameOfDog + "is :");
        for (int i =0; i<4; i++)// first 4 dogbreeds
        {
            randomOnput = rng.nextInt(maxPercentageAllow); // random number of percentage
            if (randomOnput ==0)// if the percentage is 0 reroll
            {
                while(true){
                    randomOnput = rng.nextInt(maxPercentageAllow);
                    if (randomOnput >0){
                        break;
                    }
                }
            }
            remainingPercentage =remainingPercentage - randomOnput; // remaining = current remaining % - this type random percentage
            maxPercentageAllow = remainingPercentage - (4 - i); 
            System.out.println(randomOnput + "% " + dogBreeds[i]);
        }
        System.out.println(remainingPercentage + "% " + dogBreeds[4]); // lastone 
        
        
    }
    
    public static void main(String [] args){
        
        System.out.print("What is your dog's name? ");
        Scanner myScanner = new Scanner(System.in);
        String nameOfDog = myScanner.nextLine();
        DogDNA(nameOfDog);
        
    }
    
}
