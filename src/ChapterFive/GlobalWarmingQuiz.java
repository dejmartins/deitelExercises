package ChapterFive;

import java.util.Objects;
import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int correct = 0;
        int wrong = 0;
        System.out.println("GLOBAL WARMING FACTS QUIZ");

        System.out.println("Press enter to begin.");
        try{System.in.read();}
        catch(Exception ignored){}

        System.out.print("""
                Q. Global warming remains a topic of discussion mostly amongst:
                    A. Students & Teachers
                    B. Parents & Children
                    C. Scientists & Politicians
                    D. Professors & Scientists
                """);
        String answer = in.nextLine();
        if(Objects.equals(answer, "C")) correct++;
        else wrong++;

        System.out.print("""
                Q. Global warming is commonly synonymous:
                    A. Climate Change
                    B. Cloud Engineering
                    C. Weather Condition
                    D. Greenhouse gases
                """);
        answer = in.nextLine();
        if(Objects.equals(answer, "A")) correct++;
        else wrong++;

        System.out.print("""
                Q. Which of these movies was on global warming:
                    A. Titanic
                    B. Gone with the Wind
                    C. The Valley of Decision
                    D. An inconvenient truth
                """);
        answer = in.nextLine();
        if(Objects.equals(answer, "D")) correct++;
        else wrong++;

        System.out.println();

        if (correct == 3)
        System.out.println("You got everything, very good");
        else if (correct == 2) System.out.println("Time to brush up");
        else System.out.println("You performed poorly, you failed " + wrong + " out of 3");

    }

}


