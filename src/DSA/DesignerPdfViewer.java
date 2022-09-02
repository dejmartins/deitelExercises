package DSA;

import java.util.ArrayList;
import java.util.List;

public class DesignerPdfViewer {

    public int designerPdfViewer(List<Integer> h, String word) {
        int max = 0;
        for (char letter : word.toCharArray()){
            if(h.get((int) letter - 97) > max) max = h.get((int) letter - 97);
        }
        return max * word.toCharArray().length;
    }
}
