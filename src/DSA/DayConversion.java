package DSA;

public class DayConversion {

    int year;
    int month;
    int day;

    public DayConversion(int numberOfDays){
        if (numberOfDays > 0 && numberOfDays < 30) {
            day = numberOfDays;
        }

        if (numberOfDays >= 30 && numberOfDays < 360){
            betweenThirtyAndThreeSixty(numberOfDays);
        }

        if (numberOfDays >= 360){
            aboveThreeSixty(numberOfDays);
        }
    }

    private void betweenThirtyAndThreeSixty(int numberOfDays){
        month = numberOfDays / 30;
        day = numberOfDays % 30;
    }

    private void aboveThreeSixty(int numberOfDays){
        year = numberOfDays / 360;
        if (numberOfDays % 360 > 0 && numberOfDays % 360 <= 30) day = numberOfDays % 360;
        else if (numberOfDays % 360 > 30) {
            betweenThirtyAndThreeSixty(numberOfDays % 360);
        }
    }

    public String getDuration(){
        StringBuilder stringBuilder = new StringBuilder();
        if (year > 0) stringBuilder.append(year).append("y");
        if (month > 0) stringBuilder.append(month).append("m");
        if (day > 0) stringBuilder.append(day).append("d");

        return stringBuilder.toString();
    }

}
