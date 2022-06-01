package ChapterSix;

import java.security.SecureRandom;

public class ComputerAssistedInstruction {

    private int answer;
    private int multiplier;
    private int multiplicand;
    static SecureRandom random = new SecureRandom();

    public void generateQuestion() {
        this.multiplier = generateMultiplier();
        this.multiplicand = generateMultiplicand();
        System.out.printf("How much is %d times %d: ", multiplier, multiplicand);
    }


    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return multiplier * multiplicand == answer;
    }

    private int generateMultiplier(){
        return random.nextInt(9);
    }

    private int generateMultiplicand(){
        return random.nextInt(9);
    }

    public void continueAsking(){
        System.out.printf("How much is %d times %d: ", multiplier, multiplicand);
    }

}
