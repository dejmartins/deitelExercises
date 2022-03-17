package chapterThree;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String month;
    private int day;
    private int year;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setMonth(String month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }

    public int ageInYears(){
        int newAge = 2022 - year;
        return newAge;
    }
    public double maximumHeartRate(){
        int newAge = 2022 - year;
        double maxHeartRate = 220 - newAge;
        return maxHeartRate;
    }

    public String targetHeartRate(){
        double targetHeartRate1 = 0.5 * maximumHeartRate();
        double targetHeartRate2 = 0.85 * maximumHeartRate();
        return targetHeartRate1 +" - "+ targetHeartRate2;
    }

}

