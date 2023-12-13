import java.sql.SQLOutput;

public class TypesVariablesSyntaxNotes {
    public static void main(String[] args) {
        System.out.println("This is an example of a statement");
        System.out.println("notice that it ends with a semicolon.");
        System.out.println("When we creat statements: they MUST end with a semicolon");
        System.out.println("or java gets mad at us... so add the semicolon");

        //this is a single line comment

        byte smallNum = 19;
        System.out.println(smallNum);
        smallNum = 127;
        smallNum++;
        System.out.println(smallNum); //this gives us -128 because byte can only store up to 127 so it rolls over

        int numDefault;
        numDefault = 0; // MUST set a value for a variable before  accessing it
        System.out.println(numDefault);

        char firstLetterOfSeth = 'S'; //stored in a single set of '', this includes numbers

        String message = "I'm a string!";
        String quote = "\"Better out than in, I always say.\" - Shrek, but also joe Stephens?!";
        System.out.println(message);
        System.out.println(quote);

        final String STUDENT_OF_IMUGI = "Seth \"star Student\" Crist"; //final is like using constant in JS

        byte tinyNum = 22;
        short stillSmallNum = (short) (tinyNum + 3); //casting
        System.out.println(stillSmallNum); // 25

        float almostPi = 3.14F; //F to make it a float
        int almostAlmostPie = (int) almostPi;
        System.out.println(almostPi);

        long bigNum = 200L; // L to make it a long
    }
}
