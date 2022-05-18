package chapterTen;

import java.util.Arrays;
import java.util.Objects;

public class ArrayList<S> implements List{

    public int length;
    private int counter;
    private String[] db = new String[5];


    private void expandArray(){
        if (db[db.length - 2] != null){
            String[] temp = Arrays.copyOf(db, db.length);
            db = Arrays.copyOf(temp, db.length * 2);
        }
    }

    private void compressArray(){
        if (db[db.length - 5] == null){
            String[] temp = Arrays.copyOf(db, db.length);
            db = Arrays.copyOf(temp, db.length - 5);
        }
    }

    @Override
    public void add(String item) {
        expandArray();
        db[counter] = item;
        counter++;
    }

    @Override
    public void add(int index, String item) {
        expandArray();
        int lastIndex = db.length - 1;
        if (db[lastIndex] == null)
            for(int count = lastIndex - 1; count >= index; count--){
                db[lastIndex] = db[count];
                lastIndex--;
            }
        db[index] = item;
    }

    @Override
    public String get(int index) {
        return db[index];
    }

    @Override
    public void remove(String item) {
        compressArray();
        for(int count = 0; count < db.length; count++){
            if (Objects.equals(db[count], item)) remove(count);
        }
    }

    @Override
    public void remove(int index) {
        compressArray();
        for(int count = index; count < db.length - 1; count++){
            db[count] = db[count + 1];
        }
        counter--;
    }

    @Override
    public int size() {
        return counter;
    }

}
