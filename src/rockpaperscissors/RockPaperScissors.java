/*
A game of rock, paper scissors with scoring

By Bilal Ahmad
 */
package rockpaperscissors;

import java.util.Scanner;
        
public class RockPaperScissors {
    
    
    //decalre global variable
    public static Scanner scan1 = new Scanner(System.in);
    public static String userChoice;
    public static String continuePlaying;
    public static int computerChoice;
    public static int computerWin;
    public static int userWin;
    public static int drawGames;    
    public static int totalGames;

    
    public static void main(String[] args) {
        validInput ();
    }
    
    
    //method to check for valid input from user and start point of the game
    public static void validInput() {
        System.out.println("Let's play Rock, Papers and Scissors. Please make a choice by typing R, P or S.");
        userChoice = scan1.next();
        userChoice = userChoice.toUpperCase(); //changes userChoice to uppercase if user enters lowercare alphabets
        
        
        if (!((userChoice.equals("R")) || (userChoice.equals("P")) || (userChoice.equals("S")))) {
            System.out.println("Please enter a valid choice");
            validInput();
        } else {System.out.println("You have chosen " +userChoice);
            play();
        }
        
        
    }
    
    
    //method to generate comuter choices and compare it with user input
     public static void play() {
         
        //generates computer choice with random int, 0 = Rock, 1 = Paper and 2 = Scissors 
        computerChoice = (int)(Math.random()*3);
        
        
        if ((computerChoice == 0) && (userChoice.equals("R"))) {
            System.out.println("Computer chose Rock, it's a draw!");
            totalGames++;
            drawGames++;
        } else if ((computerChoice == 1) && (userChoice.equals("R"))) {
            System.out.println("Computer chose Paper, you lose!");
            totalGames++;
            computerWin++;
        } else if ((computerChoice == 2) && (userChoice.equals("R"))) {
            System.out.println("Computer chose Scissors, you win!");
            totalGames++;
            userWin++;
        } else if ((computerChoice == 0) && (userChoice.equals("P"))) {
            System.out.println("Computer chose Rock, you win!");
            totalGames++;
            userWin++;
        } else if ((computerChoice == 1) && (userChoice.equals("P"))) {
            System.out.println("Computer chose Paper, it's a draw!");
            totalGames++;
            drawGames++;
        } else if ((computerChoice == 2) && (userChoice.equals("P"))) {
            System.out.println("Computer chose Scissors, you lose!");
            totalGames++;
            computerWin++;
        } else if ((computerChoice == 0) && (userChoice.equals("S"))) {
            System.out.println("Computer chose Rock, you lose!");
            totalGames++;
            computerWin++;
        } else if ((computerChoice == 1) && (userChoice.equals("S"))) {
            System.out.println("Computer chose Paper, you win!");
            totalGames++;
            userWin++;
        } else {
            System.out.println("Computer chose Scissors, it's a draw!");
            totalGames++;
            drawGames++;
    }
        
        
        playAgain(); //calls continue playing method
}
     
     //method to offer user choice to continue playing
    public static void playAgain() {
        
        System.out.println("Would you like to play again? (Y/N)");
        continuePlaying = scan1.next();
        continuePlaying = continuePlaying.toUpperCase(); //changes user entry to uppercase
        
        
        if (!((continuePlaying.equals("Y")) || (continuePlaying.equals("N")))) {
        System.out.println("Invalid Choice. Please enter either Y or N to continue.");
        playAgain();
        } else if (continuePlaying.equals("Y")) {
            validInput(); //calls initiate game method for positive answer
        } else {
        /*calculates and prints total number of games, drawn games, and games
        won by user and computer from play() method at the end of the game*/
        System.out.println("Thanks for playing, you won " +userWin+ " games, computer won " +computerWin+ " games out of total " +totalGames+ " games. " +drawGames+ " games were drawn.");
        }
        
        
     }
}