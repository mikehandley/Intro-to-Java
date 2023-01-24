1. Create a Game class with private attributes:
    - computerNumber: to store the random number that the user needs to guess
    - userGuess: to store the user's guess
    - count: to store the number of tries the user has made
    - input: of type Scanner, to get input from the user

2. Create a constructor for the Game class that:
    - generates a random number between 1 and 100 and assigns it to computerNumber
    - sets userGuess and count to 0
    - creates a new Scanner object and assigns it to input

3. Create a play method for the Game class that:
    - plays the game until the userGuess is correct

4. In the play method, use a while loop that:
    - keeps going until the userGuess is correct

5. In the while loop, use the Scanner object to:
    - get userGuess from the user
    - increment the count by 1

6. Inside the while loop, determine if the userGuess is correct:
    - if it is correct, print "Correct! You guessed the number in " + count + " tries." and exit the loop
    - if it is not correct, determine if the userGuess is too high or too low:
        - if it is too high, print "Your guess is too high. Try again."
        - if it is too low, print "Your guess is too low. Try again."

7. In the main method, create a new instance of the Game class and call the play method to start the game

Or in short:
1. Create a game
2. Generate a random number between 1 and 100 
3. Ask the user to guess the number
4. Compare the user's guess to the randomly generated number 
5. If the guess is too high, tell the user to try again with a lower number
6. If the guess is too low, tell the user to try again with a higher number
7. If the guess is correct, tell the user "Congratulations, You won!"
8. Repeat steps 3-7 until the user correctly guesses the number