package DataStructures;

public class Set{

    ArrayList list = new ArrayList();
    private int counter;


    public void add(int number) {
        if(!list.contains(number)){
            list.add(number);
            counter++;
        }
    }

    public int size() {
        return counter;
    }

    public void clear() {
        int myCount = counter;
        for(int count = 0; count < myCount; count++){
            list.remove(count);
            counter--;
        }
    }


    public void remove(int index) {
        list.remove(index);
    }

    public boolean contains(int value) {
        return list.contains(value);
    }

}
