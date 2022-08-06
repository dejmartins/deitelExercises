package DSA;

public class DayOfProgrammer {

    public String getDate(int year) {
        int dayOfProgrammer = 256;
        int numberOfDaysBeforeSeptember = 244;


        if (year >= 1700 && year <= 1917){
            if (year % 4 == 0) {
                return (dayOfProgrammer - numberOfDaysBeforeSeptember) + "." + "09." + year;
            } else return (dayOfProgrammer - (numberOfDaysBeforeSeptember - 1)) + "." + "09." + year;
        }

        if (year == 1918){
            return ((dayOfProgrammer - numberOfDaysBeforeSeptember) + 14) + "." + "09." + year;
        }

        if (year >= 1919 && year <= 2700){
            if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                return (dayOfProgrammer - (numberOfDaysBeforeSeptember)) + "." + "09." + year;
            } else return (dayOfProgrammer - (numberOfDaysBeforeSeptember - 1)) + "." + "09." + year;
        }

        return null;
    }

}
