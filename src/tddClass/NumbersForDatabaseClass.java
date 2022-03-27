package tddClass;

public class NumbersForDatabaseClass {
    public static void main(String[] args) {
        int number = 01;
        int number2 = 011;

        for(int counter = 1; counter <= 19; counter+=1){
            number = number + 1;
            number2 = number + 3;
            System.out.printf("(0%d, 0%d)%n", number, number2);
        }
    }
}
