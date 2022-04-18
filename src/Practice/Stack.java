package Practice;

public class Stack {

    private int numberOfElements;
    private final int[] elements = new int[10];
    int showElement;

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void push(int element) {
        elements[numberOfElements] = element;
        numberOfElements++;
    }

    public int pop() {
        numberOfElements--;
        return elements[numberOfElements];
    }

    public int peek() {
        return elements[numberOfElements - 1];
    }
}
