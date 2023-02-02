package javaLearning.moduleTwo;

public class switchSpecials {
    /**
     * @author Hyghdrogin
     * @param args
     */

    public static void main(String[] args) {
        int day = 2;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid Day";
        };
        System.out.println(dayType);
    }
}
