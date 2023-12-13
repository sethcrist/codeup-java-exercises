public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World"); //strings have to be set in "", and characters ''

// Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
    int myFavoriteNumber = 5;
        System.out.println(myFavoriteNumber);

// Create a String variable named myString and assign a string value to it, then print the variable out to the console
    String myString = "Hello from Seth";
        System.out.println(myString);

// Change your code to assign a character value to myString. What do you notice
    //    myString = 'S'; // red line because of mismatch data types
        System.out.println(myString);

// Change your code to assign the value 3.14159 to myString. What happens?
    //    myString = 3.14159; red line because of mismatch data types, cannot contain a numeric value
        System.out.println(myString);

// Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens
    //    long myNumber;
    //        System.out.println(myNumber); // error bc it has to be defined

// Change your code to assign the value 3.14 to myNumber. What do you notice?
    //    long myNumber = 3.14; // long cannot have a decimal, would have to cast it inorder to work

// Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
    //    long myNumber = 123L; // still being declared as a long (L @ the end)

// Change your code to assign the value 123 to myNumber.
    //    long myNumber = 123;

// Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens?
    float myNumber = 3.14F; // add the F @ the end and then no issue or you could cast, (float) 3.14
        System.out.println(myNumber);

// Copy and paste the following code blocks one at a time and execute them
//      int x = 5;
//      System.out.println(x++); // post increase
//      System.out.println(x);
//
//
//      System.out.println(++x); // pre increase
//      System.out.println(x);

// Try to create a variable named class. What happens?
    //    int class = "dog"; // class is reserved

// Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;
        // Copy and paste the code above and then run it. Does the result match with your expectation?
            // throws an exception (run time error) and we cannot run the program. STRING IS INCOMPATIBLE WITH INT


    // How is the above example different from the code block below?

    // int three = (int) "three";
    // What are the two different types of errors we are observing?
            // string is incompatible with int

// Rewrite the following expressions using the relevant shorthand assignment operators:
//         int x = 4;

        // x = x + 5;
//            x += 5;

//         int x = 3;
//         int y = 4;
        // y = y * x;
//            y *= x;


        // int x = 10;
        // int y = 2;
        // x = x / y;
        // x /= y;

        // y = y - x;
            //y -= x;

// What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
            // it will give an error

// What happens if you increment a numeric variable past the type's capacity?
        //it will roll over
    }
}
