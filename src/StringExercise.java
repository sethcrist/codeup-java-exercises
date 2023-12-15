//------------------------------STRING NOTES----------------------
//      immutable, once a string is created, it cannot be changed.

//      concatenation
//          String message = "Hello";
//          System.out.println(message); // prints "Hello"
//          message = message + " World!";
//          System.out.println(message); // prints "Hello, World!"

//      String Comparison Methods
//          .equals = determine, case-sensitively, if two strings have the same value
//          .equalsIgnoreCase = determine if two strings have the same value, disregarding their casing.
//          .startsWith = determine, case-sensitively, if one string starts with another
//          .endsWith = determine, case-sensitively, if one string ends with another.

//      String Manipulation Methods
//          String sample = "my name is seth";
//              - SOUT(sample.charAt(4)); // would give you 'a'
//              - SOUT(sample.substring(0,8)); // would give you "my name"
//              - SOUT(sample.indexOf("seth")); // would give you "11"
//              - SOUT(sample.lastIndexOf("seth")); // would give you "14"
//              - SOUT(sample.length()); // would give you "15"
//              - SOUT(sample.replace("seth", "mark")); // will give you "my name is mark"
//              - SOUT(sample.toLowerCase()); // makes everything lower case
//              - SOUT(sample.toUpperCase()); // makes everything upper case




public class StringExercise {
    public static void main(String[] args) {
//      For each of the following output examples: create a String variable that contains the desired output and print it out to the console,
//      you can do this with only one String variable and one print statement for each output example
//          "We don't need no education"
//          "We don't need no thought control"
                String education = "We don't need no education\n" +
                        "We don't need no thought control";
                System.out.println(education);


//          "Check "this" out!, "s inside of "s!"
                String check = "Check \"this\" out!, \"s inside of \"s!";
                System.out.println(check);

//          "In windows, the main drive is usually C:\"
                String windows = "In windows, the main drive is usually C:\\";
                System.out.println(windows);

//          "I can do backslashes \, double backslashes \\, and the amazing triple backslash \\\!"
                String backSlash = "I can do backslashes \\, double backslashes \\\\,\n" +
                        "and the amazing triple backslash \\\\\\!";
                System.out.println(backSlash);
    }
}
