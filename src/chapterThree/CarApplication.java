package chapterThree;

public class CarApplication {
    public static void main(String[] args){
        Car bmw = new Car("e30", "2003", 5000);
        Car benz = new Car("90e", "2013", 9000);

        System.out.printf("The bmw costs %.2f USD%n", bmw.getPrice());
        System.out.printf("The benz costs %.2f USD%n%n", benz.getPrice());

        System.out.printf("The bmw costs %.2f USD, but I can offer for %.2f%n", bmw.getPrice(), bmw.fivePercentOff());
        System.out.printf("The benz costs %.2f USD, but I can offer for %.2f", benz.getPrice(), benz.sevenPercentOff());
    }
}
