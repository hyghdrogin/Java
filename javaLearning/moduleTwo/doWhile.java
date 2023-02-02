package javaLearning.moduleTwo;

import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {
        /**
         * Description do...While loop
         * 
         * @params
         *         A do...while loop is similar to a while loop, except that a
         *         do...while loop is guaranteed to execute at least one time.
         *         ! Notice that the condition appears at the end of the loop, so the
         *         ! statements in the loop execute once before it is tested.
         *         ! Even with a false condition, the code will run once.
         * 
         * @task description
         *       You're creating a bank security system. The user must insert the
         *       correct password in order to access payments.
         *       The password is 8819.
         * 
         * @task
         *       Write a program that will continuously take a password as input and
         *       output Write password, until the client inserts the correct password.
         */
        try (Scanner read = new Scanner(System.in)) {
            int password = 8819;
            do {
                System.out.print("Write Password");
                password = read.nextInt();
            } while (password != 8819);
        }
    }
}
