// Intro to Java Assignment by Michael Handley
import java.util.Scanner;

class Game {
    //attributes for the number guessing game
    private int computerNumber; // Initialize variable computerNumber
    private int userGuess; // Initialize variable userGuess
    private int count; // Initialize variable count
    private Scanner input; // Initialize variable input
    // "Initialize" means to set a starting value for a variable. 
    // In the code, we can see that the computerNumber, userGuess, count, and input variables are all being given initial values in the constructor of the Game class.
    // This is important because it sets the starting point for these variables before the game begins.

    // constructor initializing the class variables
    public Game() {
        computerNumber = (int) (Math.random() * 100 + 1); // Assign a random number between 1 and 100 to computerNumber
        userGuess = 0; // Assign 0 to userGuess
        count = 0; // Assign 0 to count
        input = new Scanner(System.in); // Create new Scanner object
    }
    
    public void play() {
        while (userGuess != computerNumber) { // Continues the loop until user guess the number
            System.out.print("Enter your guess between 1 and 100: "); // Ask user to enter their guess
            userGuess = input.nextInt(); // Assign user's guess to userGuess variable
            count++; // increment count by 1
            if (userGuess == computerNumber) { // check if user's guess is correct
                System.out.println("Congratulations! You guessed the number in " + count + " tries."); // Print "Congratulations! You guessed the number in " + count + " tries."
            } else if (userGuess > computerNumber) { // check if user's guess is too high
                System.out.println("Too high. Try again."); // Print "Too high. Try again."
            } else { // check if user's guess is too low
                System.out.println("Too low. Try again."); // Print "Too low. Try again."
            }
        }
    }
}

class NumberGuessingGame { //A container for the code that makes up the game. 
    public static void main(String[] args) {  // Creates a special method called main, which is where the program starts executing when it is run.
        Game game = new Game(); // creates a new instance of the Game class, which is like making a new copy of the game.
        game.play(); // Calls the play method of the new game instance, which starts the game loop and allows the user to play the game.
    }
}
