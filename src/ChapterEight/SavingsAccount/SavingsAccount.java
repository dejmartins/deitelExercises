package ChapterEight.SavingsAccount;

public class SavingsAccount {
    private static final int numberOfYears = 12;
    private static double interestRate = 1.0;
    private double savingsBalance;
    public void topSavings(int amount) throws InterestRateException {
        if (amount > 0) {
            savingsBalance += amount;
        } else throw new InterestRateException("Amount cannot be less than zero");
    }

    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * interestRate) / numberOfYears;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(int interestRate) throws InterestRateException {
        if (interestRate <= 0) {
            throw new InterestRateException("Interest rate cannot be below zero");
        } else SavingsAccount.interestRate = (double)interestRate / 100;
    }

    public static int getNumberOfYears(){
        return numberOfYears;
    }

//    public static void setNumberOfYears(int numberOfYears) {
//        SavingsAccount.numberOfYears = numberOfYears;

//    }
}
