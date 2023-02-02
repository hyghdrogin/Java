package javaLearning.moduleOne;

import java.util.Scanner;

public class starter {

    public static void main(String[] args) {
        /**
         * @project Time Converter
         */
        try (Scanner scanner = new Scanner(System.in)) {
            ;
            int days = scanner.nextInt();

            int daysToHour = days * 24;
            int hourToMins = daysToHour * 60;
            int secsToMins = hourToMins * 60;

            System.out.println(secsToMins + "Seconds");
        }
    }
}