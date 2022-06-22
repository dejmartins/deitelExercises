package ChapterEight.Food;

public enum Food {
    APPLE("fruit", 52),
    BANANA("fruit", 89),
    CARROT("vegetable", 41);

    public final String type;
    public final int numberOfCalories;
    Food(String type, int numberOfCalories){
        this.type = type;
        this.numberOfCalories = numberOfCalories;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfCalories() {
        return numberOfCalories;
    }
}
