package ChapterSeven;

public class PixelQuantization {

    public int[] quantizeImagePixelValues(int[] imagePixels) {
        for (int i = 0; i < imagePixels.length; i++) {
            if(imagePixels[i] >= 0 && imagePixels[i] <= 20) imagePixels[i] = 10;
            else if(imagePixels[i] >= 21 && imagePixels[i] <= 40) imagePixels[i] = 30;
            else if(imagePixels[i] >= 41 && imagePixels[i] <= 60) imagePixels[i] = 50;
            else if(imagePixels[i] >= 61 && imagePixels[i] <= 80) imagePixels[i] = 70;
            else if(imagePixels[i] >= 81 && imagePixels[i] <= 100) imagePixels[i] = 90;
            else if(imagePixels[i] >= 101 && imagePixels[i] <= 120) imagePixels[i] = 110;
            else if(imagePixels[i] >= 121 && imagePixels[i] <= 140) imagePixels[i] = 130;
            else if(imagePixels[i] >= 141 && imagePixels[i] <= 160) imagePixels[i] = 150;
            else if(imagePixels[i] >= 161 && imagePixels[i] <= 180) imagePixels[i] = 170;
            else imagePixels[i] = 190;
        }
        return imagePixels;
    }
}
