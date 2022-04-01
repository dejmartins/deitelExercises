package ChapterFive;

public class SumOddNumbers {
    public static void main(String[] args) {
        sumOfOddNumbers();
    }

    public static void sumOfOddNumbers(){
        int[] oddNumbers = new int[100];
        int total = 0;
        for(int odd = 1; odd < 100; odd++){
            if(odd % 2 != 0) {
                oddNumbers[odd] = odd;
                total += oddNumbers[odd];
            }
        }
        System.out.println(total);
    }
}
