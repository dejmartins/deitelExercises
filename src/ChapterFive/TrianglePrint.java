package ChapterFive;

public class TrianglePrint {
    public static void main(String[] args) {

        for (int numberOfRows = 1; numberOfRows <= 10; numberOfRows = numberOfRows + 1) {

            for (int numberOfStars = 1; numberOfStars <= numberOfRows; numberOfStars++) {
                System.out.print('*');
            }
//
            System.out.println();
        }

        System.out.println();

        for (int numberOfRows = 1; numberOfRows <= 10; numberOfRows++) {

            for (int numberOfStars = 10; numberOfStars >= numberOfRows; numberOfStars--) {
                System.out.print('*');
            }

            for (int numberOfSpaces = 0; numberOfSpaces < numberOfRows; numberOfSpaces++) {
                System.out.print(' ');
            }

            System.out.println();
        }

        System.out.println();

        for (int numberOfRows = 1; numberOfRows <= 10; numberOfRows++) {

            for (int numberOfSpaces = 2; numberOfSpaces <= numberOfRows; numberOfSpaces++) {
                System.out.print(' ');
            }

            for (int numberOfStars = 10; numberOfStars >= numberOfRows; numberOfStars--) {
                System.out.print('*');
            }

            System.out.println();
        }

        System.out.println();

        for (int numberOfRows = 1; numberOfRows <= 10; numberOfRows++) {

            for (int numberOfSpaces = 9; numberOfSpaces >= numberOfRows; numberOfSpaces--) {
                System.out.print(' ');
            }

            for (int numberOfStars = 1; numberOfStars <= numberOfRows; numberOfStars++) {
                System.out.print('*');
            }

            System.out.println();
        }











        System.out.println();
        for (int numberOfRows = 1; numberOfRows <= 10; numberOfRows = numberOfRows + 1) {
            for (int numberOfStars = 1; numberOfStars <= numberOfRows; numberOfStars++) {
                System.out.print('*');
            }

            for(int numberOfSpaces = 10; numberOfSpaces >= numberOfRows; numberOfSpaces--){
                System.out.print(' ');
            }

            for (int numberOfStars = 10; numberOfStars >= numberOfRows; numberOfStars--) {
                System.out.print('*');
            }

            for (int numberOfSpaces = 0; numberOfSpaces <= numberOfRows; numberOfSpaces++) {
                System.out.print(' ');
            }

            for (int numberOfSpaces = 1; numberOfSpaces <= numberOfRows; numberOfSpaces++) {
                System.out.print(' ');
            }

            for (int numberOfStars = 10; numberOfStars >= numberOfRows; numberOfStars--) {
                System.out.print('*');
            }

            for (int numberOfSpaces = 10; numberOfSpaces >= numberOfRows; numberOfSpaces--) {
                System.out.print(' ');
            }

            for (int numberOfStars = 1; numberOfStars <= numberOfRows; numberOfStars++) {
                System.out.print('*');
            }
            System.out.println();
        }
        }
    }

