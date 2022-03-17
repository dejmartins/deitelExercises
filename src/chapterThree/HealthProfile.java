package chapterThree;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private String month;
    private int day;
    private int year;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender,
                         String month, int day, int year, double height,
                         double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int usersAge() {
        int age = 2022 - year;
        return age;
    }

    public double maximumHeartRate() {
        double maxHeartRate = 220 - usersAge();
        return maxHeartRate;
    }

    public String targetHeartRate() {
        double targetHeartRate1 = 0.5 * maximumHeartRate();
        double targetHeartRate2 = 0.85 * maximumHeartRate();
        return targetHeartRate1 + " - " + targetHeartRate2;
    }
    public double bodyMaxIndex(){
        double bMI = (weight * 703) / (height * height);
        return bMI;
    }
}
