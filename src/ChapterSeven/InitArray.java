package ChapterSeven;

public class InitArray {
    public static void main(String[] args) {

//        System.out.print("Enter a 3 digit number: ");

        if(args.length != 3){
            System.out.println("Error, please re_enter a value");
        }
        else{
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            for(int counter = 0; counter < array.length; counter++){
                array[counter] = initialValue + increment * counter;
            }

            System.out.println("Index  Value");

            for(int counter = 0; counter < array.length; counter++){
                System.out.printf("%5d%7d%n", counter, array[counter]);
            }
        }
    }
}
