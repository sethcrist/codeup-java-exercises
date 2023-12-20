// 5. Create a class named HighLow inside of src that picks a random number between 1 and 100.
// Prompts user to guess the number.
// All user inputs are validated.
// If user's guess is less than the number, it outputs "HIGHER", If user's guess is more than the number, it outputs "LOWER".
// If a user guesses the number, the game should declare "GOOD GUESS!"
public class HighLow {

    public static void guessMessage(int guess, int randomNumber) {
        if (guess == randomNumber) {
            System.out.println("Good Guess");
        } else if (guess < randomNumber) {
            System.out.println("Higher!");
        } else {
            System.out.println("Lower");
        }
    }

    public static void init () {
        System.out.println("Welcome to the number guessing game!");
        int randomNumber = MethodsExercises.getRandomInt(1, 100); // we can refer to other methods for other files
        System.out.println(randomNumber);
        System.out.println("Guess a number between 1 - 100!");
        int guess = MethodsExercises.getInteger(1, 100);
        guessMessage(guess, randomNumber);
    }

    public static void main(String[] args) {
        init();
    }
}
