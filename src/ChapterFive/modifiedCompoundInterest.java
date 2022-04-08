package ChapterFive;

public class modifiedCompoundInterest {
    public static void main(String[] args) {
        int principal = 1000;
        int year;


            for(year = 1; year <= 10; ++year){
                int amount = (int) (principal * Math.pow((1 + (0.05)), year));
                int cents = (int) (((principal * Math.pow(1 + 0.05, year)) * 100) % 100);
                System.out.printf("Year %d: %,d.%d%n", year, amount, cents);

            }
    }
}
