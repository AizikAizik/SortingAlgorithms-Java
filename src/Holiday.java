import java.text.DecimalFormat;

public class Holiday {

    private String name; // name of the holiday
    private int day; // day of the month
    private String month; // name of the month

    //constructor
    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    // compare months date
    private static boolean compareHolidayMonth(Holiday h1, Holiday h2){
        return h1.month.equalsIgnoreCase(h2.month);
    }

    private static double avgDate(Holiday[] holidays){
        double sum = 0.0;
        double avg;
        for (Holiday h: holidays) {
            sum += h.day;
        }
        avg = sum / holidays.length;
        return avg;
    }

    public static void main(String[] args) {
        Holiday independenceDay = new Holiday("Independence Day", 1, "October");
        Holiday christmasDay = new Holiday("Christmas Day", 25, "December");
        Holiday newYearsDay = new Holiday("New Year's Day", 1, "January");

        // testing the output for compare holiday method here
        boolean isMonthEqual = compareHolidayMonth(independenceDay, christmasDay);

        if(isMonthEqual){
            System.out.printf("The %s is the same month as %s %n", independenceDay.name, christmasDay.name);
        }else{
            System.out.printf("The %s is not the same month as %s %n", independenceDay.name, christmasDay.name);
        }

        // end of testing holiday method

        // Testing avg date method here
        Holiday[] holObj = {independenceDay, christmasDay, newYearsDay};
        DecimalFormat df = new DecimalFormat("#.##");

        double holidayDayAvg = avgDate(holObj);

        System.out.printf("The Average of all the Holidays date's are %s %n", df.format(holidayDayAvg));
    }

}
