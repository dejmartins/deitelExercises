package Assignments;

public class MyersBriggsScoreSheet {
    private static int introvert = 0;
    private static int extrovert = 0;
    private static int sensing = 0;
    private static int intuitive = 0;
    private static int thinking = 0;
    private static int feeling = 0;
    private static int judging = 0;
    private static int perceptive = 0;

    public static void introvertOrExtrovert(String option){
        if(option == "A") extrovert++;
        else if(option == "B") introvert++;
        else System.out.println("Invalid option\n");
    }

    public static void sensingOrIntuitive(String option){
        if(option == "A") sensing++;
        else if(option == "B") intuitive++;
        else System.out.println("Invalid option\n");
    }

    public static void thinkingOrFeeling(String option){
        if(option == "A") thinking++;
        else if(option == "B") feeling++;
        else System.out.println("Invalid option\n");
    }

    public static void judgingOrPerceptive(String option){
        if(option == "A") judging++;
        else if(option == "B") perceptive++;
        else System.out.println("Invalid option\n");
    }

    public static void personalityType(){
        if(introvert > extrovert) System.out.print("I");
        else System.out.print("E");

        if(sensing > intuitive) System.out.print("S");
        else System.out.print("N");

        if(thinking > feeling) System.out.print("T");
        else System.out.print("F");

        if(judging > perceptive) System.out.print("J");
        else System.out.print("P");
    }
}
