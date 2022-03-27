package ChapterSix;

public class AC {

    private boolean isOn;
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setOn() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }


}
