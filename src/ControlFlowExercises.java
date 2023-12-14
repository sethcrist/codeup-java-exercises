//---------------------notes for Control statements and loops----------------
//      boolean value, either true or false
//          - Equality: ==
//          - Inequality: !=
//          - Greater than: >
//          - Less than: <

//      Logical Operators
//          - && (and): Returns a true value if both expressions are true. Only evaluates the second expression if necessary.
//          - || (or): Returns a true value if either expression is true. Only evaluates the second expression if necessary.
//          - &: Returns a true value if both expressions are true. Always evaluates both expressions
//          - |: Returns a true value if either expressions is true. Always evaluates both expressions

//      If statements
//          - if (condition) {
//              conditional code
//            }

//          - boolean someCondition = false;
//            boolean someOtherCondition = true;
//
//              if (someCondition) {
//                  executes if someCondition is true
//              } else if (someOtherCondition) {
//                  executes if someOtherCondition is true *and* all of the previous ifs in
//                  this block were false
//              } else {
//                  executes if none of the conditions checked in this block were true
//              }

//      Switch statements
//          - int caseSwitch = 0;

//              switch (caseSwitch) {
//                  case 1:
//                      System.out.println("Case 1");
//                      // Fall through!
//                  case 2:
//                      System.out.println("Case 2");
//                      break;
//                  default:
//                      System.out.println("Default case");
//                      break;
//              }

//      While loop
//          int i = 0;
//          while (i < 10) {
//              System.out.println("i is " + i);
//              i++;
//          }

//      Do loop
//          do {
//              System.out.println("You will see this despite the condition!");
//          } while (false);

//      For loop
//          for(/* init */; /* condition */; /* update */) {  // like: for(i = 0; i <= condition; i++)
//              statements
//          }

//      Break and Continue
//          BREAK
//              print the numbers 1 through 5
//
//              for(int i = 1; i < 100; i++) {
//                  System.out.println(i);
//                  if (i == 5) {
//                      break; // --------------+
//                  } //                        |
//              } //                            |
//                 <----------------------------+

//          CONTINUE
//              for(int i = 1; i <= 10; i++) { // <--+
//                  if(i % 2 == 1) { //              |
//                      continue; // ----------------+
//                  }
//              System.out.println(i);
//              }

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//---------------------------------------WHILE LOOP---------------------
//      Create an integer variable i with a value of 5
//      Create a while loop that runs so long as i is less than or equal to 15
//      Each loop iteration, output the current value of i, then increment i by one.
            //int i = 5;
            //while (i <= 15) {
            //System.out.println("i is " + i); // or do i++ here
            //i++;
            //}

//---------------------------------DO WHILE---------------------------
//      Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
            //int i = 0;
            //do {
            //System.out.println(i);
            //i += 2;
            //} while (i <= 100);

//      Alter your loop to count backwards by 5's from 100 to -10
            //int i = 100;
            //do {
                //System.out.println(i);
                //i -= 5;
            //} while (i >= 10);

//      Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000
            //long c = 2L;
            //do {
                //System.out.println(c);
                //c *= c;
            //} while (c <= 1_000_000L);

//      Refactor the previous two exercises to use a for loop instead.
            //for (int a = 5; a <= 15; a++) {
                //System.out.println(a);
            //}
            //System.out.println("==================");
            //for (int b = 0; b <= 100; b += 2) {
                //System.out.println(b);
            //}
            //System.out.println("===============");
            //for (int b = 100; b >= -10; b -= 5) {
                //System.out.println(b);
            //}
            //System.out.println("===============");
            //for (long c = 2; c < 1_000_000; c *= c) {
                //System.out.println(c);
            //}
            //System.out.println("===============");

//----------------------------  Fizzbuzz  -----------------------------------
//      Write a program that prints the numbers from 1 to 100.
//      For multiples of 3: print “Fizz” instead of the number.
//      For the multiples of 5: print “Buzz”.
//      For numbers which are multiples of both 3 and 5: print “FizzBuzz”. (15)
            //for (int i = 1; i <= 100; i++) {
                //if (i % 15 == 0) {             // 3 x 5 = 15, that which get us fizzbuzz
                    //System.out.println("FIZZBUZZ!!");
                //} else if (i % 3 == 0) {
                    //System.out.println("Fizz");
                //} else if (i % 5 == 0) {
                    //System.out.println("buZZ");
                //} else {
                    //System.out.println(i);
                //}
            //}
//      using a switch statement
            //for (int i = 1; i <= 100; i++) {
               //int condition = 0;

               //if (i % 3 == 0) {
                   //condition += 1;
               //}
               //if (i % 5 == 0) {
                   //condition += 2;
               //}

               //switch (condition) {
                   //case 1:
                       //System.out.println("Fizz");
                       //break;
                   //case 2:
                       //System.out.println("Buzz");
                       //break;
                   //case 3:
                       //System.out.println("Fizzbuzz");
                       //break;
                   //default:
                       //System.out.println(i);
                       //break;
               //}
            //}

//-----------------Display a table of powers--------------------
            Scanner scanner = new Scanner(System.in);
//      Prompt the user to enter an integer.
//      Display a table of squares and cubes from 1 to the value entered.
//      Ask if the user wants to continue.
//      Assume that the user will enter valid data.
//      Only continue if the user agrees to.
            while (true) {
                System.out.println("welcome to the square table of power(s)!\n enter a number");
                int userNum = scanner.nextInt();
                System.out.println("number  |  squared  |  cubed");
                System.out.println("--------|-----------|-------");
                for (int num = 1; num <= userNum; num++) {
                    System.out.printf("%-7d  | %-7d  | %d%n", num, num * num, num * num *num);
                }
                System.out.println("wanna see another number? [yes/no]");
                String resp = scanner.next();
                if (resp.equalsIgnoreCase("no")) {
                    break;
                }
                System.out.println("Restarting...");
            }


//-------------Convert given number grades into letter grades--------------
//      Prompt the user for a numerical grade from 0 to 100.
//      Display the corresponding letter grade.
//      Prompt the user to continue.
//      Assume that the user will enter valid integers for the grades.
//      The application should only continue if the user agrees to.
        System.out.println("Would you like to see your grade? [y/n]");
        String userInput = scanner.next();

        while (userInput.equalsIgnoreCase("y")) {
            System.out.println("whats your grade percentage?");
            int grade = scanner.nextInt();

            char letterGrade;
            if (grade > 100) {
                System.out.println("yeah right, the grading system is capped at 100%");
                continue;
            } else if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
            System.out.printf("Currently you have a: %c.%n\n nicely done, assuming you have anything higher than a 70.", letterGrade);
            System.out.println("Would you like to see your grade?");
            userInput = scanner.next();
        }
    }
}
