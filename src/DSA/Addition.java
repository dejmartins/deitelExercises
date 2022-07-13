package DSA;

public class Addition {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }

    public static int sum(int number){
        int add = 0;
        
        while (number > 0){
            add += number % 10;
            number /= 10;
        }

        return add;
    }
}
