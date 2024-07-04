public class HelloNewWorld {
    public static void main(String[] args) {
        System.out.println("Hello New World");

// Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 5;
        System.out.println(myFavoriteNumber);

// Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Hello New World";
        System.out.println(myString);

// Change your code to assign a character value to myString. What do you notice?
        // myString = 'C'; wont work due to mismatched data types

// Change your code to assign the value 3.14159 to myString. What happens?
        // myString = 3.14159; red line because of mismatch data types, cannot contain a numeric value

// Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
         // long myNumber ;
        // System.out.println(myNumber); number must be defined

// Change your code to assign the value 3.14 to myNumber. What do you notice?
        // long myNumber = 3.14; long cannot have decimal, use float

// Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
         // long myNumber = 123L; the l at the end denotes long
        // System.out.println(myNumber);

// Change your code to assign the value 123 to myNumber.
        // long myNumber = 123;

        // Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        // myNumber = 3.14;
    }
}
