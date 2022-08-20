package DSA;

public class CountingValleys {

    public int countingValleys(int steps, String path) {
        int count = 0;
        int numberOfValleysTraversed = 0;
        for (int i = 0; i < steps; i++) {
            if(path.charAt(i) == 'U') count++;
            if(path.charAt(i) == 'D') count--;
            if(path.charAt(i) == 'U' && count == 0) numberOfValleysTraversed++;
        }
        return numberOfValleysTraversed;
    }
}
