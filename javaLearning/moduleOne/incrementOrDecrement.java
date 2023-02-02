package javaLearning.moduleOne;

import java.util.Scanner;

public class incrementOrDecrement {

    public static void main(String[] args) {
        /**
         * Description
         * 
         * @params An increment or decrement operator provides a more convenient and
         *         compact way to increase or decrease the value of a variable by one.
         * 
         *         The increment operator (++) is used to decrease the value of a
         *         variable by one.
         *         For example, the statement x=x+1; can be simplified to ++x;
         *         The decrement operator (--) is used to decrease the value of a
         *         variable by one.
         *         For example, the statement x=x-1; can be simplified to --x;
         */
        try (Scanner myhygh = new Scanner(System.in)) {
            int initialScore = Integer.parseInt(myhygh.nextLine());
            int ArsenalScore = initialScore;
            int CityScore = ++initialScore;
            System.out.println("Arsenal " + ArsenalScore + " - " + CityScore + " City.");
        }
        /**
         * Description Prefix and Postfix
         * 
         * @params Two forms, prefix and postfix, may be used with both the increment
         *         and decrement operators.
         *         With prefix form, the operator appears before the operand, while in
         *         postfix form, the operator appears after the operand. Below is an
         *         explanation of how the two forms work:
         *         Prefix: Increments the variable's value and uses the new value in the
         *         expression.
         *         The value of x is first incremented to 35, and is then assigned to y,
         *         so the values of both x and y are now 35.
         *         Postfix: The variable's value is first used in the expression and is
         *         then increased.
         *         x is first assigned to y, and is then incremented by one. Therefore,
         *         x becomes 35, while y is assigned the value of 34.
         */
    }
}
