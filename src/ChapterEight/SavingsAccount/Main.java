package ChapterEight.SavingsAccount;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) throws InterestRateException {
        try{
            SavingsAccount saver1 = new SavingsAccount();
            SavingsAccount saver2 = new SavingsAccount();

            saver1.topSavings(2000);
            saver2.topSavings(3000);

            calculateInterestFor(saver1, 4);
            calculateInterestFor(saver2, 4);

            System.out.printf("Interest rate for Saver1 is %s%n", NumberFormat.getCurrencyInstance().format(saver1.getSavingsBalance()));
            System.out.printf("Interest rate for Saver2 is %s%n%n", NumberFormat.getCurrencyInstance().format(saver2.getSavingsBalance()));

            calculateInterestFor(saver1, 5);
            calculateInterestFor(saver2, 5);

            System.out.printf("Interest rate for Saver1 is %s%n", NumberFormat.getCurrencyInstance().format(saver1.getSavingsBalance()));
            System.out.printf("Interest rate for Saver2 is %s%n", NumberFormat.getCurrencyInstance().format(saver2.getSavingsBalance()));
        } catch (InterestRateException interestRateException){
            System.out.println("Savings amount cannot be less than N1");
        }
    }

    public static void calculateInterestFor(SavingsAccount saver, int interestRate) throws InterestRateException {
        try{
            SavingsAccount.modifyInterestRate(interestRate);
            for(int counter = 0; counter <= SavingsAccount.getNumberOfYears(); counter++){
                saver.calculateMonthlyInterest();
            }
        } catch (InterestRateException interestRateException){
            System.out.println("Interest rate cannot be less than 1");
        }

    }


}
