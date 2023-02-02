package javaLearning.moduleTwo;

import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {
        /**
         * Description While Loops
         * 
         * @params For your math class you need a program to calculate the factorial of
         *         a number.
         *         You're given a program which takes a number as input.
         * @task Complete the program to calculate the factorial of the given number and
         *       output it
         */
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            int fact = 1;
            // your code goes here
            while (number > 0) {
                fact *= number--;
            }
            System.out.print(fact);
        }
    }
}
