package ChapterFive;

public class Sum {
    public static void main(String[] args) {

        int result = 0;

        for(int counter = 0; counter <= 20; counter += 2){
            result = result + counter;
        }

        System.out.println(result);
    }
}
