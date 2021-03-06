package tddClass;

public class Kata {


    public boolean isPalindrome(int fiveDigits) {

        int digitOne = fiveDigits % 10;
        int digitTwo = fiveDigits % 100;
        int digitThree = fiveDigits % 1000;
        int digitFour = fiveDigits % 10000;
        int digitFive = fiveDigits % 100000;

        int newDigitFive = digitOne / 1;
        int newDigitFour = digitTwo / 10;
        int newDigitThree = digitThree / 100;
        int newDigitTwo = digitFour / 1000;
        int newDigitOne = digitFive / 10000;

        if (newDigitFive == newDigitOne && newDigitFour == newDigitTwo) {
            return true;
        }
        return false;
        /*int backwards = newDigitOne * 10000 + newDigitTwo * 1000 + newDigitThree * 100 + newDigitFour * 10 + newDigitFive * 1;

        if(fiveDigits == backwards) return true;
        return false;*/
    }

    public int numberOfCopies(int copies) {
        int result = 0;
        if (copies >= 1 && copies <= 4) result = 2000 * copies;
        if (copies >= 5 && copies <= 9) result = 1800 * copies;
        if (copies >= 10 && copies <= 29) result = 1600 * copies;
        if (copies >= 30 && copies <= 49) result = 1500 * copies;
        if (copies >= 50 && copies <= 99) result = 1300 * copies;
        if (copies >= 100 && copies <= 199) result = 1200 * copies;
        if (copies >= 200 && copies <= 499) result = 1100 * copies;
        if (copies >= 500 && copies <= 1000) result = 1000 * copies;
        return result;
    }


    public int quotient(int firstNumber, int secondNumber) {
        int result = 0;
        if (firstNumber > secondNumber) result = firstNumber / secondNumber;
        if (secondNumber > firstNumber) result = secondNumber / firstNumber;
        if (firstNumber == secondNumber) result = firstNumber / secondNumber;
        return result;
    }

    public boolean isEven(int number) {
        boolean result = false;
        if (number % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public int highest(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        int result = 0;
        int highestNumber = firstNumber;

        if (secondNumber > highestNumber)
            highestNumber = secondNumber;

        if (thirdNumber > highestNumber)
            highestNumber = thirdNumber;

        if (fourthNumber > highestNumber)
            highestNumber = fourthNumber;

        if (fifthNumber > highestNumber)
            highestNumber = fifthNumber;

        result = highestNumber;
        return result;
    }

    public int factorsOf(int number) {
        int counter = 0;
        int factor = 1;
        int result;

        while(factor <= number){
            result = number % factor;
            factor++;


            if(result == 0) {
                counter++;
            }
        }
        return counter;
    }

    public boolean primeNumberOf(int number) {

            int factor = 1;
            int result;
            int counter = 0;

            while(factor <= number){
                result = number % factor;
                factor++;

                if(result == 0) {
                    counter++;
                }
            }

            if(counter == 2){
                return true;
            }
            else  return false;
        }


}

