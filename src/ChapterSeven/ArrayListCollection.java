package ChapterSeven;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("Books");
        items.add(0, "Batteries");

        System.out.println("Displaying all list elements..");
        for(int i = 0; i < items.size(); i++){
            System.out.printf("%s ", items.get(i));
        }

        items.add("Watches");
        items.add("Pins");

        System.out.println();
        for(String item : items){
            System.out.printf("%s ", item);
        }

        items.remove(2);

        System.out.println();
        for(String item : items){
            System.out.printf("%s ", item);
        }

        System.out.println("\n\nArray list size is: " + items.size());
    }
}
