//------------------methods notes-------------------
//      public static String sayHello(String name) { // sayhello is the method
//          return String.format("Hello, %s!", name);
//      }

//      public -- this is the visibility modifier
//      static -- the presence of this keyword defines that the method belongs to the class, as opposed to instances of it.
//      String -- this is the return type of the method.

//      void method -- you cannot print to the terminal, it doesn't return anything

//      Method Overloading
//          - defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.

//              // version 1
//          public static void sayHello(int times) {
//              for (int i = 0; i < times; i += 1) {
//                  sayHello();
//              }
//          }

//              // version 2
//          public static void sayHello() {
//              sayHello("Hello", "World");
//          }

//              // version 3
//          public static void sayHello(String name) {
//              sayHello("Hello", name);
//          }

//              // version 4
//           public static void sayHello(String greeting, String name) {
//              System.out.println(greeting + ", " name "!");
//           }

//          - to call the method = sayHello(); // will call version 2
//          - https://www.youtube.com/watch?v=cAb0nbNzabo

//      Passing Parameters To Methods
//          public static void changeString(String s) {
//              s = "Wub a lub a dub dub";
//          }
//
//          public static void main(String[] args) {
//              String changeMe = "hello codeup!";
//
//          changeString(changeMe);
//
//          System.out.println(changeMe);  // will return "hello codeup!"
//          }


import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//------------section for basic Arithmetic
        //System.out.println("adding 4 + 3 = " + add(4, 3));
        //System.out.println("subtracting 6 - 5 = " + sub(6, 5));
        //System.out.println("multiplying 5 * 6 = " + mult(5, 6));
        //System.out.println("dividing 8 / 4 = " + div(8, 4));
        //System.out.println("finding the modulus of 8 % 4 = " + modulus(5, 5));

//------------asking the user for a number between 1 & 15
        //System.out.println("Enter a number between 1 and 15");
        int userInput = getInteger(1, 15);
        //System.out.println("You entered: " + userInput);

//------------Calculate the factorial of a number.
        //System.out.println(calculateFactorial(1)); //1
        //System.out.println(calculateFactorial(2)); //2
        //System.out.println(calculateFactorial(3)); //6
        //System.out.println(calculateFactorial(4)); //24
        //promptFactorial();

//---------------Dice rolling
        //System.out.println(getRandomInt(1, 5));
        //diceRoll();

//---------------Game development

    }

//  1. Create four separate methods. Each will perform an arithmetic operation: +, -, *, /
//     Add a modulus(%) method that finds the modulus of two numbers.
    //public static int add(int num1, int num2) {
        //return num1 + num2;
    //}

    //public static int sub(int num1, int num2) {
        //return num1 - num2;
    //}

    //public static int mult(int num1, int num2) {
        //return num1 * num2;
    //}

    //public static float div(int num1, int num2) {
        //return num1 / num2;
    //}

    //public static int modulus(int num1, int num2) {
        //return num1 % num2;
    //}

//  2.  Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range.
//      If not, prompt the user to input their number again until the input is within range

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume the invalid input
        }
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("your input is not between 1 and 15, choose another number between " + min + " and " + max + ".");
            return getInteger(min, max);
        }
        return userInput;
    }

//  3.  Calculate the factorial of a number by Prompting the user to enter a number from 1 to 10
//        public static long calculateFactorial (int num) {
//        Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter a number between 1 and 10 for a factorial"); // asks the user to enter a number
//            int userNumber = scanner.nextInt();
//            for (int i = 1; i <= num; i += 1) { // sets the parameter of the number
//                System.out.println("you entered: " + userNumber); // display what the user entered
//                userNumber *= i;
//            }
//            return userNumber;
//        }
//------------using recursion--------
    public static long calculateFactorial (int num) {
        Scanner scanner = new Scanner(System.in);
        if (num == 1) return 1;
        return calculateFactorial(num - 1) * num;
    }

    public static void promptFactorial() {
        Scanner scanner = new Scanner(System.in);
        String continueMessage;
        System.out.println("welcome to the factorial zone!");
        do {
            System.out.println("what number should we calculate?");
            int userInt = getInteger(1, 10);
            System.out.println("the factorial of " + userInt + " is: " + calculateFactorial(userInt) + ".");
            System.out.println("would you like to enter another number? [y/n]");
            continueMessage = scanner.nextLine();
        } while (continueMessage.equalsIgnoreCase("yes"));
    }

// 4. Create an application that simulates dice rolling by asking the user to enter the number of sides for a pair of dice
// Prompt the user to roll the dice
// "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again
// Use static methods to implement the method(s) that generate the random numbers.
// Use the .random method of the java.lang.Math class to generate random numbers.
    public static int getRandomInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) +1));
    }

    public static void diceRoll () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the dice roll");
        System.out.println("Enter the number of sides the dice has. (1 - 6)");
        int numberOfDiceSides = getInteger(1, 6);
        System.out.printf("you have rolled %d and a %d", getRandomInt(1, numberOfDiceSides), getRandomInt(1, numberOfDiceSides));
    }






}


