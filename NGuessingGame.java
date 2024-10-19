//package Projects.Number Guessing Game (OOPs);
// ! Problem Statement:--
/*
 * Create class Game, which allows a user to play "Guess the Number" game once, Game should have following methods:
 
 * 1> Constructor to generate the random number
 * 2> takeUserInput() to take a user input of number
 * 3> isCorrectNumber() to detect whether the number entered by the user is True
 * 4> getter and setter for no.ofGuesses
 * Use Properties such as noOfGuesses(int), etc to get this task done!
 */

//  * Creating class

import java.util.Random;
import java.util.Scanner;

class Game{
     int rnumber;
     int user;
     int nGuesses=0;
     boolean isCorrectNumber = false;
     char y;
    Scanner sc = new Scanner(System.in);

    Game(){
        Random r = new Random();
        rnumber=r.nextInt(100)+1; //* Random number between 1 to 100 */
    }

    public int getRnumber() {
        return rnumber;
    }
    public void takeUserInput(){
        System.out.println("Enter a number between 1 to 100");
        user= sc.nextInt();
    }
    public boolean isCorrectNumber(){
        nGuesses++; // Increment no.of guesses
        if (user>rnumber) {
            System.out.println("Too high! Try Again.");
            return false;
        }else if (user<rnumber) {
            System.out.println("Too low! Try Again.");
            return false;
        }else{
            System.out.println("Congratulations! You guessed the number in " + nGuesses + " attempts");
            return true;
        }
    }

    public int getNoOfGuesses(){
        return nGuesses;
    }

    // ! Method to implement the game logic
    public void play(){
        boolean correctGuess = false;
        System.out.println("-----: Game Start Now :------");
        // * Loop until the user guesses the correct number
        while (!correctGuess) {
            takeUserInput();
            correctGuess = isCorrectNumber();
        }
    }
    public void showRNumber(){
        System.out.println("Do you want to check which number computer had take? ");
        System.out.println("Type 'Y' for Yes or 'N' for No");
        y = sc.next().charAt(0);
        if (y=='Y' || y=='y') {
            System.out.println("Computer had taken  " + rnumber);
            System.out.println("Have A Nice Day,");
            System.out.println("-----:Game End:-----");
        }else if (y=='N' || y=='n') {
            System.out.println("Have A Nice Day,");
            System.out.println("----:Game End:-----");
        }
    }
  
   
}
public class NGuessingGame {
    public static void main(String[] args) {
        Game g = new Game();
        System.out.println("Welcome to Number Guessing Game:");
        g.play(); // Start the game
        g.showRNumber();

    }
}
