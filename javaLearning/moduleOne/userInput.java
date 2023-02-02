package javaLearning.moduleOne;

import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        /**
         * Description Getting User Input
         * 
         * @params While Java provides many different methods for getting user input,
         *         the Scanner object is the most common, and perhaps the easiest to
         *         implement. Import the Scanner class to use the Scanner object.
         *         You can now read in different kinds of input data that the user
         *         enters.
         *         Here are some methods that are available through the Scanner class:
         *         Read a byte - nextByte()
         *         Read a short - nextShort()
         *         Read an int - nextInt()
         *         Read a long - nextLong()
         *         Read a float - nextFloat()
         *         Read a double - nextDouble()
         *         Read a boolean - nextBoolean()
         *         Read a complete line - nextLine()
         *         Read a word - next()
         */
        try (Scanner myVar = new Scanner(System.in)) {
            System.out.println(myVar.nextLine());
        }
    }
}
