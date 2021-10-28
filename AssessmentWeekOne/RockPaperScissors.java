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
public class RockPaperScissors {
    
    public static void Match(Scanner myScanner){
        int countWins =0;
        int countLoses = 0;
        int countTie = 0;
        int rounds =0;
        int totalRound = 0;
        try{
            String input = myScanner.nextLine();
            totalRound = Integer.parseInt(input);
            while (totalRound < 0 || totalRound > 10){
                System.out.println("The Rounds number is not in the range of 1 to 10");
                System.out.println("Please enter a number between 1 to 10");
                try {
                    input = myScanner.nextLine();
                    totalRound = Integer.parseInt(input);
                } catch(NumberFormatException ex) {
                    System.out.println("Wrong Input, Input could not be parsed into an integer");
                }
            }
            
            System.out.println("The Round you have select is " + totalRound);
            System.out.println("Round starts");
            System.out.println("Please select one of the following number");
            System.out.println("1-Rock");
            System.out.println("2-Paper");
            System.out.println("3-Scissors");
            
            for (int i =0; i< totalRound; i++){

                //Computer input and print out the message
                Random rng = new Random();
                int randomInput = 1 + rng.nextInt(3);
                switch(randomInput)
                {
                    case 1:
                        System.out.println("Computer output is Rock:");
                        break;
                    case 2:
                        System.out.println("Computer output is Paper:");
                        break;
                    case 3:
                        System.out.println("Computer output is Scissors:");
                        break;         
                }                
            
                //Player input and print out the message
                try {
                    input = myScanner.nextLine();
                    int userinput = Integer.parseInt(input);
                    while (userinput < 1|| userinput > 3)
                    // makes sure the input is valid                 
                    {
                        System.out.println("The Input is out of range");
                        System.out.println("1-Rock");
                        System.out.println("2-Paper");
                        System.out.println("3-Scissors");
                        System.out.println("Please enter a number between 1 to 3");
                        try {
                            input = myScanner.nextLine();
                            userinput = Integer.parseInt(input); 
                            
                        } catch(NumberFormatException ex) {
                            System.out.println("Wrong Input, Input could not be parsed into an integer");
                            }
                    }

                    //System.out.println(randomInput);
                    //Check Who wins the match
                    if (userinput == randomInput){
                        countTie++;
                        rounds++;
                        System.out.println("This Round is Ties!:");
                        System.out.println("Round played :" + rounds);
                        System.out.println("Wins:" + countWins);
                        System.out.println("Loses:" + countLoses);
                        System.out.println("Tie:" + countTie);

                    }
                    else if (userinput == 1 && randomInput == 2||userinput == 2 && randomInput == 3 ||userinput == 3 && randomInput == 1){
                        countLoses++;
                        rounds++;
                        System.out.println("This Round, you have lost!:");
                        System.out.println("Round played :" + rounds);
                        System.out.println("Wins:" + countWins);
                        System.out.println("Loses:" + countLoses);
                        System.out.println("Tie:" + countTie);
                    }
                    else{
                        countWins++;
                        rounds++;
                        System.out.println("This Round, you have win!!!:");
                        System.out.println("Round played :" + rounds);
                        System.out.println("Wins:" + countWins);
                        System.out.println("Loses:" + countLoses);
                        System.out.println("Tie:" + countTie);
                    }
                    
                    //Check Who wins the Game
                    if (countWins >0.5* (totalRound-countTie)){
                        System.out.println("You win the game");
                        break;
                    }
                    else if (countLoses >0.5* (totalRound-countTie)){
                        System.out.println("You lose the game");
                        break;
                    }
                    else if (rounds == totalRound&& countWins > countLoses){
                        System.out.println("You win the game");
                    }
                    else if (rounds == totalRound&& countWins > countLoses){
                        System.out.println("You lose the game");
                    }
                    else if (rounds == totalRound&& countWins == countLoses ){
                        System.out.println("Tie!");
                    }
                } catch(NumberFormatException ex) {
                System.out.println("Wrong Input, Input could not be parsed into an integer");
            }
        }
        }catch(NumberFormatException ex) {
            System.out.println("Wrong Input, Input could not be parsed into an integer");
        }
        
    }
    
    
    public static void main (String [] args){
        int game = 1; 
        System.out.println("Welcome to Rock, Paper, Scissors Game");
        System.out.println("Please enter the round number between 1 to 10 you want to play");
        Scanner myScanner = new Scanner(System.in);
        Match(myScanner);
        while (true)
        //make sure the input is valid
        {
            System.out.println("If you want to rematch please enter: 1");
            System.out.println("To terminated the game, please enter: 0");
            try{
                String input = myScanner.nextLine();
                game = Integer.parseInt(input); 
                if(game == 0){
                    return;
                }   
                else if(game == 1){
                    System.out.println("Game Restarted");
                    System.out.println("Welcome to Rock, Paper, Scissors Game");
                    System.out.println("Please enter the round number between 1 to 10 you want to play");
                    Match(myScanner);    
                }

                else{
                    System.out.println("Invalid Input");   

                    } 
                }catch(NumberFormatException ex) {
                System.out.println("Wrong Input, Input could not be parsed into an integer");
                }
                
        }
    }
            
}
       
        
    
    

