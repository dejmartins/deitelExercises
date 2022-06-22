package ChapterEight;

public class ComplexNumbers {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumbers(){

    }

    public ComplexNumbers(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void plus(ComplexNumbers complex) {
        realPart += complex.getRealPart();
        imaginaryPart += complex.getImaginaryPart();
    }

    public String getValue() {
        return String.format("(%.0f, %.0f%s)", realPart, imaginaryPart,"i");
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void minus(ComplexNumbers complex) {
        realPart -= complex.getRealPart();
        imaginaryPart -= complex.getImaginaryPart();
    }
}
