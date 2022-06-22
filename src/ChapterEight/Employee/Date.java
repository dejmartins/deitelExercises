package ChapterEight.Employee;

public class Date {
    private int year;
    private int month;
    private int day;

    private final int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int year, int month, int day){
        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }
        this.month = month;

        if(day < 1 || (day > daysPerMonth[month - 1] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("Invalid day in month");
        }

        if(day == 29 && month == 2 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            throw new IllegalArgumentException("Not a leap year");
        }
        this.day = day;

        String yearToString = Integer.toString(year);
        if (yearToString.length() != 4 && !(yearToString.charAt(0) < 3 && yearToString.charAt(0) > 0)){
            throw new IllegalArgumentException("Invalid year");
        }
        this.year = year;


    }

    public void nextDay(){
        if (day < daysPerMonth[month - 1] || (month == 2 && day < 29)) {
            day += 1;
        } else if (day == daysPerMonth[month - 1] && month == 12) {
            day = 1;
            month = 1;
            year += 1;
        } else if (day == daysPerMonth[month - 1] || (day == 29 && month == 2)) {
            day = 1;
            month += 1;
        }
    }

    public String toString(){
        return String.format("%d-%d-%d", day, month, year);
    }
}
