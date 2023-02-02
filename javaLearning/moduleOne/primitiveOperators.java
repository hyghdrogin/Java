package javaLearning.moduleOne;

public class primitiveOperators {

    public static void main(String[] args) {
        /**
         * Description Math Operands
         * 
         * @params Java provides a rich set of operators to use in manipulating
         *         variables. A value used on either side of an operator is called an
         *         operand.
         *         Java arithmetic operators:
         *         + addition
         *         - subtraction
         *         * multiplication
         *         / division
         *         % modulo
         */
        // Addition
        int a, b;
        a = 5;
        b = 10;
        int sum = a + b;
        System.out.println(sum);

        // Subtraction
        int difference = b - a;
        System.out.println(difference);

        // Division
        int division = b / a;
        System.out.println(division);

        // Modulo
        int modulo = a % b;
        System.out.println(modulo);

        // Multiplication
        int multiplication = a * b;
        System.out.println(multiplication);
    }
}