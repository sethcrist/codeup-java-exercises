//---------------notes on console input and output (console IO)----------------


//=======printing data============
//      System.out.println = creates a new line
//      System.out.print = does not create a new line and pushes the lines together, use \n to stop this
//      System.out.printf (System.out.format) = define a string with placeholders and then pass values for those placeholders
//          - String name = "codeup";
//          - System.out.printf("Hello there, %s. Nice to see you.%n", name);
//                  - %s = denotes a string
//                  - %n = denotes a new line for a formatted string
//                  - %d = denotes a decimal, WHOLE NUMBERS
//                  - %f = denotes a floating point numbers, %.2f will give you 2 decimal places

//          - String greeting = "Salutations"; CAN USE MULTIPLE PLACEHOLDERS
//          - String name = "codeup";
//          - System.out.printf("%s, %s!", greeting, name);
//          - can also use = System.out.printf(greeting + name);

//=======getting input from the console=======
//      import java.util.Scanner;
//          - goes at the top of the file

//      using the scanner class
//          setting the scanner up:
//          - Scanner scanner = new Scanner(System.in);

//          - System.out.print("Enter something: ");

//          - String userInput = scanner.next();

//          - System.out.println("You entered: --> \"" + userInput + "\" <--");
//              - scanner.next() = will ONLY capture one word
//              - scanner.nextLine() = will capture everything until we hit enter
//              - scanner.nextInt() = will capture an Integer



import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

// Write some Java code that uses the variable pi to output the following:
//  The value of pi is approximately 3.14.
        System.out.printf("The value of pi is approximately: %.2f %n", pi);

// setting the scanner up
        Scanner scanner = new Scanner(System.in);

// ask the user to enter an integer and store that value in an int variable using the nextInt
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        System.out.println("You entered: " + integer);

// Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter first word");
        String firstWord = scanner.next();

        System.out.println("Enter second word");
        String secondWord = scanner.next();

        System.out.println("Enter third word");
        String thirdWord = scanner.next();

        System.out.printf("The words you entered are as followed: %s, %s, %s %n", firstWord, secondWord, thirdWord);

// How david did it: -------------------------------------------------
        System.out.println("enter in 3 words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.printf("word 1: %s%n", word1);
        System.out.printf("word 2: %s%n", word2);
        System.out.printf("word 3: %s%n", word3);

// to reset the scanner use:
        scanner.nextLine();

// Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user
        System.out.println("Provide a sentence: ");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println("your story: \"" + sentence + "\""); // either will work
//        System.out.printf("Your provided sentence was: %s", sentence);

// reset the scanner
        scanner.nextLine();

// calculate the area and parameter of the codeup classroom by asking the user for the length and width.
// use the nextLine method each time you need to get user input. we need it twice, once to get the user input for the length and again to get the user input for the width.
// Parse the resulting strings to a numeric type.

        System.out.print("what is the length of your room");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("what is the width of your room");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.printf("The length of the room is %d.%nThe width of the room is %d.%nThe perimeter of the room is %d.%nThe area of the room is %d.%n", length, width, (2 * length) + (2 * width), length * width);

    }
}
