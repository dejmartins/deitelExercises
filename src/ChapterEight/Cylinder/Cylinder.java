package ChapterEight.Cylinder;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cylinder {
    private int radius = 1;

    private int height = 1;

    public double volume() {
        double volume = Math.PI * Math.pow(getRadius(), 2) * getHeight();
        BigDecimal bd = BigDecimal.valueOf(volume).setScale(2, RoundingMode.HALF_UP);
        volume = bd.doubleValue();
        return volume;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else throw new ArithmeticException("Radius should be greater than zero");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0){
            this.height = height;
        } else throw new ArithmeticException("Height should be greater than zero");
    }
}
