package DSA;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TimeDuration {
    public static void main(String[] args) {
        System.out.println(solution(32));
    }

    public static String solution(int x){
        int week = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int second = 0;
        double value = 0;

        if (x > 604799){
           value = (double) x / 604800;
           BigDecimal bd = BigDecimal.valueOf(value).setScale(6, RoundingMode.CEILING);
           value = bd.doubleValue();
           week = (int) value;
           day = (int) ((value - week) * 7);
           hour = (int) ((((value - week) * 7) - day) * 24);
           minute = (int) ((((((value - week) * 7) - day) * 24) - hour ) * 60);
           second = (int) ((((((((value - week) * 7) - day) * 24) - hour ) * 60) - minute ) * 60);
        }

        if (x > 86399 && x < 604800){
            value = (double) x / 86400;
            BigDecimal bd = BigDecimal.valueOf(value).setScale(6, RoundingMode.CEILING);
            value = bd.doubleValue();
            day = (int) value;
            hour = (int) ((value - day) * 24);
            minute = (int) ((((value - day) * 24) - hour) * 60);
            second = (int) ((((((value - day) * 24) - hour) * 60) - minute ) * 60);
        }

        if (x > 3599 && x < 86400){
            value = (double) x / 3600;
            BigDecimal bd = BigDecimal.valueOf(value).setScale(6, RoundingMode.CEILING);
            value = bd.doubleValue();
            hour = (int) value;
            minute = (int) ((value - hour) * 60);
            second = (int) ((((value - hour) * 60) - minute ) * 60);
        }

        if (x > 59 && x < 3600){
            value = (double) x / 60;
            BigDecimal bd = BigDecimal.valueOf(value).setScale(6, RoundingMode.CEILING);
            value = bd.doubleValue();
            minute = (int) value;
            second = (int) ((value - minute) * 60);
        }

        if (x >= 0 && x < 60) second = x;


        StringBuilder stringBuilder = new StringBuilder();
        if (week > 0) stringBuilder.append(week).append("w");
        if (day > 0) stringBuilder.append(day).append("d");
        if (hour > 0 && day < 1) stringBuilder.append(hour).append("h");
        if (minute > 0 && day < 1 && week < 1) stringBuilder.append(minute).append("m");
        if (second > 0 && day < 1 && week < 1 && hour < 1) stringBuilder.append(second).append("s");

//        if (second > 0 && day < 1 && week < 1 && hour < 1) stringBuilder.insert(0, second).insert(1,"s");
//        if (minute > 0 && day < 1 && week < 1) stringBuilder.insert(0, minute).insert(1, "m");
//        if (hour > 0 && day < 1) stringBuilder.insert(0, hour).insert(1, "h");
//        if (day > 0) stringBuilder.insert(0, day).insert(1,"d");
//        if (week > 0) stringBuilder.insert(0, week).insert(1,"w");

        return stringBuilder.toString();
    }


}


//        if (value < 0.1) {
//            value = (double) x / 60;
//            BigDecimal bd = BigDecimal.valueOf(value).setScale(6, RoundingMode.CEILING);
//            double whole = bd.doubleValue();
//            minute = (int) whole;
//            second = (int) ((whole - minute) * 60);
//        }