package javaLearning.moduleTwo;

import java.util.Scanner;

public class logical {

    public static void main(String[] args) {
        /**
         * Logical Statements
         * 
         * @description
         * @param You're a tour manager and need a program that will identify small
         *               countries.
         *               A country is considered small if its population is under 10000
         *               and its area is under 10000 hectares.
         *               The given program takes population and area as input.
         * 
         * @task
         *       Complete the program to output "small country" if both conditions are
         *       met. Don't output anything otherwise.
         */
        try (Scanner read = new Scanner(System.in)) {
            int population = read.nextInt();
            int area = read.nextInt();
            // Complete the code
            // 2 Way method to sort this task
            // Method 1
            // if (population < 10000 && area < 10000) {
            // System.out.println("small country");
            // }
            // Method 2
            if (population < 10000) {
                if (area < 10000) {
                    System.out.println("small country");
                }
            }
        }
    }
}
