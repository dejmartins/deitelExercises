package ChapterSix;

import java.util.Scanner;

public class ComputerAssistedMain {
    public static void main(String[] args) {
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        ComputerAssistedInstruction quiz = new ComputerAssistedInstruction();

        System.out.println("ELEMENTARY LEARNING PLATFORM");

        quiz.generateQuestion();
        int answer = sc.nextInt();
        quiz.setAnswer(answer);

        while(!quiz.isCorrect()){
            quiz.continueAsking();
            answer = sc.nextInt();
            quiz.setAnswer(answer);

            while ((quiz.isCorrect())){
                quiz.generateQuestion();
                answer = sc.nextInt();
                quiz.setAnswer(answer);
            }
        }
    }

}
