package javaLearning.moduleTwo;

import java.util.Scanner;

public class conditional {

    public static void main(String[] arg) {
        /**
         * @conditional statement - if
         */

        try (Scanner scanner = new Scanner(System.in)) {
            int price = scanner.nextInt();
            // complete the code
            if (price <= 12000) {
                System.out.println("yes");
            }
        }

    }
}
