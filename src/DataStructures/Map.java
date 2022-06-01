package DataStructures;

import java.util.ArrayList;

public class Map {
    ArrayList<Integer> keys = new ArrayList<>();
    ArrayList<String> values = new ArrayList<>();
    private int counter;
    public void put(int key, String value) {
        if(!keys.contains(key)){
            keys.add(key);
            values.add(value);
            counter++;
        }
    }

    public int size() {
        return counter;
    }

    public void replace(int key, String value) {
        int count = 0;
        for(int myKey : keys){
            if(key == myKey){
                values.remove(count);
                values.add(count, value);
            }
            count += 1;
        }
    }

    public boolean containsValue(String val) {
        for (String value : values){
            if(value == val) return true;
        }
        return false;
    }


    public boolean containsKey(int key) {
        for (int value : keys){
            if(value == key) return true;
        }
        return false;
    }
}
