package ChapterEight;

import java.util.Objects;

public class RationalNumber {
    private static int numerator;
    private static int denominator;

    public RationalNumber(int numerator, int denominator) {
        int gcf = getGreatestCommonFactor(numerator, denominator);
        RationalNumber.numerator = numerator / gcf;
        RationalNumber.denominator = denominator / gcf;
    }

    public RationalNumber(){
        this(1, 1);
    }

    public String getValueIn(String type) {
        if (Objects.equals(type, "fraction")){
            return numerator + "/" + denominator;
        } else if (Objects.equals(type, "float")){
            return String.format("%.1f", (double)numerator/denominator);
        }
        return null;
    }

    private static int getGreatestCommonFactor(int numerator, int denominator){
        int greatestCommonFactor = 1;
        for (int counter = 2; counter <= numerator; counter++){
            if (numerator % counter == 0 && denominator % counter == 0){
                greatestCommonFactor = counter;
            }
        }
        return greatestCommonFactor;
    }

    public static String plus(int numerator, int denominator) {
        int newDenominator = RationalNumber.denominator * denominator;
        int newNumerator = (newDenominator / RationalNumber.denominator) * RationalNumber.numerator;
        newNumerator += (newDenominator / denominator) * numerator;

        int gcf = getGreatestCommonFactor(newNumerator, newDenominator);
        RationalNumber.numerator = newNumerator / gcf;
        RationalNumber.denominator = newDenominator / gcf;

        return RationalNumber.numerator + "/" + RationalNumber.denominator;
    }

    public static String minus(int numerator, int denominator) {
        int newDenominator = RationalNumber.denominator * denominator;
        int newNumerator = (newDenominator / RationalNumber.denominator) * RationalNumber.numerator;
        newNumerator -= (newDenominator / denominator) * numerator;

        int gcf = getGreatestCommonFactor(newNumerator, newDenominator);
        RationalNumber.numerator = newNumerator / gcf;
        RationalNumber.denominator = newDenominator / gcf;

        if (RationalNumber.numerator == 0) return "0";
        else return RationalNumber.numerator + "/" + RationalNumber.denominator;
    }

    public static String times(int numerator, int denominator) {
        int newDenominator = RationalNumber.denominator * denominator;
        int newNumerator = RationalNumber.numerator * numerator;

        int gcf = getGreatestCommonFactor(newNumerator, newDenominator);
        RationalNumber.numerator = newNumerator / gcf;
        RationalNumber.denominator = newDenominator / gcf;

        return RationalNumber.numerator + "/" + RationalNumber.denominator;
    }

    public static String divides(int numerator, int denominator) {
        int newDenominator = RationalNumber.denominator * numerator;
        int newNumerator = RationalNumber.numerator * denominator;

        int gcf = getGreatestCommonFactor(newNumerator, newDenominator);
        RationalNumber.numerator = newNumerator / gcf;
        RationalNumber.denominator = newDenominator / gcf;

        return RationalNumber.numerator + "/" + RationalNumber.denominator;
    }


}
