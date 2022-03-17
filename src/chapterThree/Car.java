package chapterThree;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setPrice(double price){
        if(price > 0)
        this.price = price;
    }

    public String getModel(){
        return model;
    }
    public String getYear(){
        return year;
    }
    public Object getPrice(){
        return price;
    }

    public double fivePercentOff(){
        price = price - (0.05 * price);
        return price;
    }
    public double sevenPercentOff(){
        price = price - (0.07 * price);
        return price;
    }
}
