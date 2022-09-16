package DSA;

public class FindOriginal {

    public int[] findOriginalArray(int[] changed) {
        if(changed.length == 1) return new int[1];

        int[] original = new int[changed.length/2];

        for(int i = 0; i < changed.length; i++){
            int doubleValue = changed[i] * 2;
            for(int j = 0; j < changed.length; j++){
                if(doubleValue == changed[j]) {
                    changed[j] = 0;
                } else return new int[1];
            }
        }

        int count = 0;
        for (int i = 0; i < changed.length; i++) {
            if(changed[i] != 0){
                original[count] = changed[i];
                count++;
            }
        }
        return original;

    }
}
