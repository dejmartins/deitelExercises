package DSA;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "07:05:45PM";
        System.out.println(getMilitaryTime(s));
    }

    private static String getMilitaryTime(String s) {
        int firstTwo = Integer.parseInt(s.substring(0, 2));
        if (s.endsWith("AM")) {
            if (firstTwo == 12) return s.replace("12", "00").substring(0, 8);
            else return s.substring(0, 8);
        } else if (s.endsWith("PM")) {
            if (firstTwo < 12) return s.replace(s.substring(0, 2), String.valueOf(12 + firstTwo)).substring(0, 8);
            else return s.substring(0, 8);
        }
        return null;
    }
}
