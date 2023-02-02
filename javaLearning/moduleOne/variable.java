package javaLearning.moduleOne;

public class variable {

    public static void main() {
        /**
         * Description
         * Variables store data for processing.
         * A variable is given a name (or identifier), such as area, age, height, and
         * the like. The name uniquely identifies each variable, assigning a value to
         * the variable and retrieving the value stored.
         * 
         * Variables have types. Some examples:
         * - int: for integers (whole numbers) such as 123 and -456
         * - double: for floating-point or real numbers with optional decimal points and
         * fractional parts in fixed or scientific notations, such as 3.1416, -55.66.
         * - String: for texts such as "Hello" or "Good Morning!". Text strings are
         * enclosed within double quotes.
         */
        // String name = "Hyghdrogin";
        // int age = 50;
        // double weight = 69.5;
        // boolean online = true;
        /**
         * @params
         *         You are given code which outputs the properties of a vehicle,
         *         but something is wrong.
         * 
         * @task
         *       Fix the code to print the properties.
         */
        String name = "Toyota";
        double engine = 4.7;
        int year = 2019;

        System.out.println("Name: " + name);
        System.out.println("Engine: " + engine);
        System.out.println("Year: " + year);
    }

}
