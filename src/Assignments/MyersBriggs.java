package Assignments;

import java.util.Scanner;

public class MyersBriggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String preferredOption;

        System.out.println("MYERS-BRIGGS Questionnaire");
        System.out.println("Select the option that accurately describes you \n");
        System.out.print("""
                A. Expend energy, enjoy groups
                B. Conserve energy, enjoy one-on-one
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.introvertOrExtrovert(preferredOption);

        System.out.print("""
                A. Interpret literally
                B. Look for meaning and possibilities
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.sensingOrIntuitive(preferredOption);

        System.out.print("""
                A. Logical, thinking, questioning
                B. Empathetic, feeling, accommodating
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.thinkingOrFeeling(preferredOption);

        System.out.print("""
                A. Organized, orderly
                B. Flexible, adaptable
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.judgingOrPerceptive(preferredOption);

        System.out.print("""
                A. More outgoing
                B. More reserved, think to yourself
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.introvertOrExtrovert(preferredOption);

        System.out.print("""
                A. Practical, realistic, experiential
                B. Imaginative, innovative, theoretical
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.sensingOrIntuitive(preferredOption);

        System.out.print("""
                A. Candid, straight forward, frank
                B. Tactful, kind, encouraging
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.thinkingOrFeeling(preferredOption);

        System.out.print("""
                A. Plan, schedule
                B. Unplanned, spontaneous
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.judgingOrPerceptive(preferredOption);

        System.out.print("""
                A. Seek many tasks, public activities, interaction with others
                B. Seek private, solitary activities with quiet to concentrate
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.introvertOrExtrovert(preferredOption);

        System.out.print("""
                A. Standard, usual, conventional
                B. Different, novel, unique
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.sensingOrIntuitive(preferredOption);

        System.out.print("""
                A. Firm, tend to criticize, hold the line
                B. Gentle, tend to appreciate, conciliate
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.thinkingOrFeeling(preferredOption);

        System.out.print("""
                A. Regulated, structured
                B. Easygoing, "live" and "let live"
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.judgingOrPerceptive(preferredOption);

        System.out.print("""
                A. External, communicative, express yourself
                B. Internal, reticent, keep to yourself
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.introvertOrExtrovert(preferredOption);

        System.out.print("""
                A. Focus on here-and-now
                B. Look to the future, global perspective, "big picture"
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.sensingOrIntuitive(preferredOption);

        System.out.print("""
                A. Tough-minded, just
                B. Tender-hearted, merciful
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.thinkingOrFeeling(preferredOption);

        System.out.print("""
                A. Preparation, plan ahead
                B. Go with the flow, adapt as you go
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.judgingOrPerceptive(preferredOption);

        System.out.print("""
                A. Active, initiate
                B. Reflective, deliberate
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.introvertOrExtrovert(preferredOption);

        System.out.print("""
                A. Facts, things, "what is"
                B. Ideas, dreams, "what could be", philosophical
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.sensingOrIntuitive(preferredOption);

        System.out.print("""
                A. Matter of fact, issue-oriented
                B. Sensitive, people-oriented,compassionate
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.thinkingOrFeeling(preferredOption);

        System.out.print("""
                A. Control, govern
                B. Latitude, freedom
                """);
        preferredOption = input.nextLine();
        MyersBriggsScoreSheet.judgingOrPerceptive(preferredOption);

        System.out.print("Your personality type is ");
        MyersBriggsScoreSheet.personalityType();

        System.out.println("\n");

        System.out.println("""
                E - Extravert
                I - Introvert
                S - Sensing
                N - Intuitive
                T - Thinking
                F - Feeling
                J - Judging
                P - Perceiving
                """);
        System.out.println("""
                ESTJ - Overseer
                ESFJ - Supporter
                ISTJ - Examiner
                ISFJ - Defender
                ESTP - Persuader
                ESFP - Entertainer
                ISTP - Craftsman
                ISFP - Artist
                ENTJ - Chief
                ENTP - Originator
                INTJ - Strategist
                INTP - Engineer
                ENFJ - Mentor
                ENFP - Advocate
                INFJ - Confidant
                INFP - Dreamer
                """);
    }
}
