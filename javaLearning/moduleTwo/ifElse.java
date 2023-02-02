package javaLearning.moduleTwo;

import java.util.Scanner;

public class ifElse {
    /**
     * Nested If Statements
     * 
     * @description
     * 
     *              The sales manager decided to give a gift card to the customers
     *              whose purchases total more than 15000.
     *              On top of this, the customers whose total purchase is above
     *              30000 will receive a second gift card.
     *              You are given a program, which takes the purchase amount as
     *              input, and print "Gift card" if it is above 15000.
     * 
     * @Task
     *       Complete the code to print "Gift card" again if the purchase is above
     *       30000.
     */

    public static void main(String[] args) {

        try (Scanner hyghInput = new Scanner(System.in)) {
            int purchases = Integer.parseInt(hyghInput.nextLine());

            if (purchases > 15000) {
                System.out.println("Gift Card");
                if (purchases > 30000) {
                    System.out.println("Gift Card");
                } else {
                    System.out.println(" ");
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}