package javaLearning.moduleTwo;

import java.util.Scanner;

public class forLoop {

    public static void main(String[] arg) {
        /**
         * Description For Loop
         * 
         * @params Another loop structure is the for loop. A for loop allows you to
         *         efficiently write a loop that needs to execute a specific number of
         *         times.
         * @syntax
         *         * for (initialization; condition; increment/decrement) {
         *         * statement(s)
         *         * }
         * @params Initialization: Expression executes only once during the beginning of
         *         loop
         *         Condition: Is evaluated each time the loop iterates. The loop
         *         executes the statement repeatedly, until this condition returns
         *         false.
         *         Increment/Decrement: Executes after each iteration of the loop.
         *         ! Notice the semicolon (;) after initialization and condition in the
         *         ! syntax.
         * 
         * @Task Description For Loop
         * 
         * @params You are given code that takes the number of students who enter the
         *         university as input. Let's greet them!
         * 
         * @task Complete the program to output "Welcome" for each student.
         */
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for (int x = 1; x <= n; ++x) {
                System.out.println("Welcome");
            }
        }
    }
}
