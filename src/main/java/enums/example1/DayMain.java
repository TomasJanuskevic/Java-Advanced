package enums.example1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class DayMain {

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            printQuoteOfTheDay(day);
        }
    }

    private static void printQuoteOfTheDay(Day currentDay) {
        switch (currentDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Just a regular working day.");
                break;
            case SATURDAY:
                System.out.println("This is saturday, let's partY!");
                break;
            case SUNDAY:
                System.out.println("This is SUNDAY, let's rest.");
                break;
            default:
                System.out.println("What day is this?");
        }

    }
}
