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
public class HealthyHearts {
    
     public static void DogDNA(int age)
             //Calculate depend on the age
     {
        int maxHeartRate =220;
        int targetHeartRateUpper;
        int targetHeartRateLower;
        maxHeartRate = 220-age;// calculate the Max Heart Rate 
        targetHeartRateUpper = (int)(maxHeartRate* 0.85); // calculate the Upper boundary of Heart Rate 
        targetHeartRateLower = (int)(maxHeartRate* 0.50);  // calculate the Lower boundary of Heart Rate 
        System.out.println(age);
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + targetHeartRateLower + "-" + targetHeartRateUpper +" beats per minute");
        
    }
    
    public static void main(String [] args){
        
        System.out.print("What is your age? ");
        Scanner myScanner = new Scanner(System.in);
        try {
        String input = myScanner.nextLine();
        int age = Integer.parseInt(input);
        DogDNA(age);
        } catch(NumberFormatException ex) {
                            System.out.println("Wrong Input, Input could not be parsed into an integer");
             }
        
        
    }
    
}
