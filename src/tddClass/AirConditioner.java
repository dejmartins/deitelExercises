package tddClass;

public class AirConditioner {
    private boolean setOn;
    private int temperature = 16;

    public void setOn(boolean on) {
        setOn = on;
    }

    public boolean isOn() {
        return setOn;
    }

    public void increaseTemperature() {
        if (temperature <= 30) temperature = temperature + 1;
        this.temperature = temperature;

    }

    public int getTemperature() {
        if(temperature > 30) return 30;
        if(temperature < 16) return 16;
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature >= 16)
            temperature = temperature - 1;
        this.temperature = temperature;
    }


}
