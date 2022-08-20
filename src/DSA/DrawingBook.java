package DSA;

public class DrawingBook {

    int numberOfFlipsFromTheFirst;
    int numberOfFlipsFromTheLast;
    public DrawingBook(int numberOfPages, int pageNumber) {
        numberOfFlipsFromTheFirst = pageNumber / 2;
        if(numberOfPages % 2 == 0 && numberOfPages - pageNumber == 1) {
            numberOfFlipsFromTheLast = ((numberOfPages - pageNumber) / 2) + 1;
        }
        else numberOfFlipsFromTheLast = (numberOfPages - pageNumber) / 2;
    }

    public int pageCount() {
        return Math.min(numberOfFlipsFromTheLast, numberOfFlipsFromTheFirst);
    }

}
