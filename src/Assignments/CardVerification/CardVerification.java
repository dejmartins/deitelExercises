package Assignments.CardVerification;

public class CardVerification {
    Card card;
    public int sumOfDoubleEvenPlace(String cardNumber){
        int result = 0;
        int doubleTheValue = 0;

        for (int counter = cardNumber.length() - 2; counter >= 0; counter-=2){
            char cardValue = cardNumber.charAt(counter);
            int numericValue = Character.getNumericValue(cardValue);
            doubleTheValue = numericValue * 2;

            result += getDigit(doubleTheValue);
        }
        return result;
    }

    private int getDigit(int doubleTheValue){
        String doubleTheValueString = String.valueOf(doubleTheValue);
        if (doubleTheValueString.length() == 2) {
            int firstValue = Character.getNumericValue(doubleTheValueString.charAt(0));
            int secondValue = Character.getNumericValue(doubleTheValueString.charAt(1));
            return firstValue + secondValue;
        }
        return doubleTheValue;
    }

    public int sumOfOddPlace(String cardNumber) {
        int result = 0;
        for (int counter = cardNumber.length() - 1; counter >= 0; counter-=2){
            char cardValue = cardNumber.charAt(counter);
            int numericValue = Character.getNumericValue(cardValue);
            result += numericValue;
        }
        return result;
    }

    public int getSum(String cardNumber) {
        return sumOfOddPlace(cardNumber) + sumOfDoubleEvenPlace(cardNumber);
    }

    public boolean isValid(String cardNumber) {
        if (getSize(cardNumber) >= 13 && getSize(cardNumber) <= 16) {
            if (prefixMatched(cardNumber, card.getPrefix())) return getSum(cardNumber) % 10 == 0;
        }
        return false;
    }

    public boolean prefixMatched(String cardNumber, int digit){
        if (card == Card.AMERICAN_EXPRESS) return digit == getPrefix(cardNumber, 2);
        return digit == getPrefix(cardNumber, 1);
    }

    private int getPrefix(String number, int k){
        String prefix = number.substring(0, k);
        if (number.length() < k){
            return Integer.parseInt(number);
        }
        return Integer.parseInt(prefix);
    }

    private int getSize(String digit){
        return digit.length();
    }

    public void myCardType(Card card){
        this.card = card;
    }

}
