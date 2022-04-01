package ChapterFour;

public class WorldPopulation {
    public static void main(String[] args) {

        anticipatedWorldPopulation();
        doubleTodaysPopulation();

    }

    private static int numberOfYears = 1;
    private static final double yearlyIncreaseRate = 0.01;
    private static double worldPopulation = 7953952567.0;
    private static double numericalIncrease = 0;
    private static double currentWorldPopulation = 0;

    private static void anticipatedWorldPopulation(){

        System.out.println("Year   No. Of Years    Population Increase");
        while (numberOfYears <= 75) {

            currentWorldPopulation = worldPopulation + worldPopulation * yearlyIncreaseRate;
            numericalIncrease = currentWorldPopulation - worldPopulation;
            System.out.printf("%-6d %.0f %13.0f%n", numberOfYears, currentWorldPopulation, numericalIncrease);
            worldPopulation = currentWorldPopulation;

            numberOfYears++;
        }

    }

    private static void doubleTodaysPopulation(){
        while (numberOfYears < 75) {
            currentWorldPopulation = worldPopulation + worldPopulation * yearlyIncreaseRate;
            numericalIncrease = currentWorldPopulation - worldPopulation;
            if(currentWorldPopulation == 7953952567.0 * 2)
            System.out.println("At year"+ numberOfYears +", the population is double today's population");
            worldPopulation = currentWorldPopulation;
            numberOfYears++;
        }
    }

}

