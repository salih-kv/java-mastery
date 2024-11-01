enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        // Using an enum in a switch statement
        switch (today) {
            case MONDAY -> System.out.println("Start of the week!");
            case FRIDAY -> System.out.println("End of the work week!");
            default -> System.out.println("Just another day.");
        }
    }
}
