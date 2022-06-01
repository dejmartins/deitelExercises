package DataStructures;

import java.util.Arrays;

public class ArrayList {
    private int[] list = new int[5];
    private int counter;

    public void add(int number) {
        expandArray();
        list[counter] = number;
        counter++;
    }

    private void expandArray(){
        if (list[list.length - 2] != 0){
            int[] temp = Arrays.copyOf(list, list.length);
            list = Arrays.copyOf(temp, list.length * 2);
        }
    }

    private void compressArray(){
        if (list[list.length - 5] == 0){
            int[] temp = Arrays.copyOf(list, list.length);
            list = Arrays.copyOf(temp, list.length - 5);
        }
    }

    public boolean contains(int number) {
        for(int value : list){
            if(value == number) return true;
        }
        return false;
    }

    public void removeLast() {
        compressArray();
        counter--;
        list[counter] = 0;
    }


    public void remove(int index) {
        compressArray();
        for(int counter = index; counter < (list.length - 1); counter++){
            list[counter] = list[counter+1];
        }
        counter--;
    }


    public void add(int number, int toIndex) {
        expandArray();
        for(int counter = list.length-1; counter > toIndex; counter--){
            list[counter] = list[counter-1];
        }
        list[toIndex] = number;
        counter++;
    }

    public int get(int index) {
        return list[index];
    }

    public int size() {
        return counter;
    }


    public boolean isEmpty() {
        return counter == 0;
    }
}
