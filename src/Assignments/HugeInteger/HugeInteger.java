package Assignments.HugeInteger;

public class HugeInteger {

    private final int[] integer = new int[40];
    private String value;
    public void parse(String hugeNumber) {
        for (int counter = 0; counter < integer.length; counter++){
            try{
                char hugeNumberCharacter = hugeNumber.charAt(counter);
                int charToIntValue = Character.getNumericValue(hugeNumberCharacter);
                integer[counter] = charToIntValue;
            } catch (StringIndexOutOfBoundsException e) {
                throw new StringIndexOutOfBoundsException();
            }
        }
        value = hugeNumber;
    }

    public String toString() {
        StringBuilder totalString = new StringBuilder();
        for(int value : integer){
            String valToString = Integer.toString(value);
            totalString.append(valToString);
        }
        return totalString.toString();
    }

    public void plus(String value) {
        for(int counter = value.length() - 1; counter >= 0; counter--){
            try {
                char eachCharacter = value.charAt(counter);
                int toDigit = Character.getNumericValue(eachCharacter);
                int sum = integer[counter] + toDigit;
                checkNumberOfCharacters(sum, counter);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException("The sum exceeded 40 Digits");
            }
        }
    }

    private void checkNumberOfCharacters(int sum, int counter){
        String addedIntegers = Integer.toString(sum);
        if (addedIntegers.length() > 1){
            char firstCharacter = addedIntegers.charAt(0);
            integer[counter - 1] += Character.getNumericValue(firstCharacter);
            char secondCharacter = addedIntegers.charAt(1);
            integer[counter] = Character.getNumericValue(secondCharacter);
        } else integer[counter] = sum;
    }

    public void minus(String value) {
        for(int counter = value.length() - 1; counter >= 0; counter--){
            char eachCharacter = value.charAt(counter);
            int toDigit = Character.getNumericValue(eachCharacter);
            integer[counter] -= toDigit;
        }
    }

    public String getValue(){
        return value;
    }

    public boolean isEqualTo(String value) {
        return this.value.equals(value);
    }

    public boolean isNotEqualTo(String value) {
        return !this.value.equals(value);
    }

    public boolean isGreaterThan(String value) {
        for(int counter = 0; counter < value.length(); counter++){
            char characterInValue = value.charAt(counter);
            int charToInt = Character.getNumericValue(characterInValue);
            if(integer[counter] > charToInt) return true;
        }
        return false;
    }

    public boolean isLessThan(String value) {
        for(int counter = 0; counter < value.length(); counter++){
            char characterInValue = value.charAt(counter);
            int charToInt = Character.getNumericValue(characterInValue);
            if(integer[counter] < charToInt) return true;
        }
        return false;
    }

    public boolean isLessThanOrEqualTo(String value) {
        return isEqualTo(value) || isLessThan(value);
    }


    public boolean isGreaterThanOrEqualTo(String value) {
        return isEqualTo(value) || isGreaterThan(value);
    }

    public boolean isZero() {
        for (int i : integer) {
            if (i != 0) return false;
        }
        return true;
    }
}
