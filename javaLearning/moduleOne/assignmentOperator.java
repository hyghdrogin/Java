package javaLearning.moduleOne;

public class assignmentOperator {

    public static void main(String[] args) {
        /**
         * Description Assignment Operators
         * 
         * @params You are already familiar with the assignment operator (=), which
         *         assigns a value to a variable.
         *         Java provides a number of assignment operators to make it easier to
         *         write code.
         *         Addition and assignment (+=)
         *         Subtraction and assignment (-=)
         *         Multiplication and assignment (*=)
         *         Division and assignment (/=)
         *         Modulo and assignment (%=)
         */

        int x, y, z, a, b;
        x = 4;
        y = 6;
        z = 2;
        a = 8;
        b = 9;

        x += x;
        y -= y;
        z *= z;
        a /= a;
        b %= b;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
    }

}
