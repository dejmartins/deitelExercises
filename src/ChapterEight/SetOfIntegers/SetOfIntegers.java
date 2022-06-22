package ChapterEight.SetOfIntegers;

import java.util.Arrays;

public class SetOfIntegers {
    private final boolean[] set = new boolean[101];

    public SetOfIntegers(){
        Arrays.fill(set, false);
    }
    public boolean isInSet(int setValue) {
        return set[setValue];
    }

    public void insertElement(int value) {
        set[value] = true;
    }

    public SetOfIntegers union(SetOfIntegers newSet) {
        SetOfIntegers unionSet = new SetOfIntegers();

        for (int count = 0; count < set.length; count++){
            if (isInSet(count) || newSet.isInSet(count)){
                unionSet.insertElement(count);
            }
        }

        return unionSet;
    }

    public SetOfIntegers intersect(SetOfIntegers newSet) {
        SetOfIntegers unionSet = new SetOfIntegers();

        for (int count = 0; count < set.length; count++){
            if (isInSet(count) && newSet.isInSet(count)){
                unionSet.insertElement(count);
            }
        }
        return unionSet;
    }

    public void deleteELement(int value) {
        set[value] = false;
    }

    public boolean isEqualTo(SetOfIntegers anotherSet) {
        return Arrays.equals(set, anotherSet.set);
    }

    public String toString(){
        StringBuilder setString = new StringBuilder();
        for (int count = 0; count < set.length; count++){
            if (set[count]){
                setString.append(count);
            } else setString.append("-");
        }
        return setString.toString();
    }
}
