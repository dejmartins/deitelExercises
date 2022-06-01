package DataStructures;

public class Queue {
    private int[] list = new int[5];
    private int counter;

    public void add(int value) {
        list[counter] = value;
        counter++;
    }

    public boolean contains(int number) {
        for(int value : list){
            if(value == number) return true;
        }
        return false;
    }

    public int peek() {
        return list[0];
    }

    public void remove() {
        for(int counter = 0; counter < (list.length - 1); counter++){
            list[counter] = list[counter+1];
        }
        counter--;
    }

    public int poll() {
        int poll = list[0];
        remove();
        counter--;
        return poll;
    }


    public int size() {
        return counter;
    }
}
