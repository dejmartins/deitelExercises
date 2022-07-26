package DSA;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateWordRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        System.out.println(removal(input));
    }

    private static List removal(String sentence) {
        sentence = sentence.toLowerCase();
        String[] elements = sentence.split(" ");

        return Stream.of(elements)
                .sorted()
                .distinct().toList();
    }
}
