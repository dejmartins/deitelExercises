package ChapterEight.Food;

public class Main {
    public static void main(String[] args) {
        System.out.println("All Fruits");

        for (Food food : Food.values()){
            System.out.printf("%-10s%-12s%-5d%n", food, food.getType(), food.getNumberOfCalories());
        }
    }
}
