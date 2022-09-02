package DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DesignerPdfViewerTest {

    @Test
    public void testDesignerPdfViewer(){
        DesignerPdfViewer pdf = new DesignerPdfViewer();
        List<Integer> h = new ArrayList<>();
        h.add(3);
        h.add(2);

        int area = pdf.designerPdfViewer(h, "ab");
        assertEquals(6, area);
    }
}