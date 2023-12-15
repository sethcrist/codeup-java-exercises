import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("lets talk to my boy Bob, say something");
//        String input = scanner.next();
//        if (input.endsWith("?")) {
//            System.out.println("Sure");
//        } else if (input.endsWith("!")) {
//            System.out.println("Whoa, chill out!");
//        } else if (input.trim().equals(" ")) {
//            System.out.println("Fine, be that way");
//        } else {
//            System.out.println("Whatever");
//        }
////        System.out.println("lets talk to my boy Bob");
//        input = scanner.next()

//-------davids way---------

        System.out.println("hows it going, wanna chat");
        while (true) {
            String input = scanner.nextLine();
            if (input.endsWith("?")) {
                System.out.println("Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.trim().equals(" ")) {
                System.out.println("Fine, be that way!");
            } else if (input.equals("banana")) {
                System.out.println("later bro");
                break;
            } else {
                System.out.println("Whatever");
            }

        }
    }
}
