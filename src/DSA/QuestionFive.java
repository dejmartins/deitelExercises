package DSA;

public class QuestionFive {
    public static void main(String[] args) {
        int[] num = {0, 0, 1, 0, 3, 1, 0, 2};

        for (int i = 0; i < num.length - 1; i++){

            if (num[i] == 0){
                int count = i + 1;
                while(num[count] == 0 && count < num.length - 1){
                    count++;
                }
                num[i] = num[count];
                num[count] = 0;

            }

        }

        for (int k : num){
            System.out.print(k + " ");
        }
    }
}
