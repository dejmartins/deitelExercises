package tddClass;

public class SeunBike {
    private boolean state;
    private int speed;

    public void keySwitch(boolean key) {
        state = key;
    }

    public boolean isOn() {
        return state;
    }

    public void gearAcceleration() {

        if(speed >= 0 && speed <= 20) {
            speed = speed + 1;
        }
        else if(speed >= 21 && speed <= 30)
            speed = speed + 2;
        else if (speed >= 31 && speed <=40)
            speed = speed + 3;

        else speed = speed + 4;
    }

    public void gearDecceleration() {

        if(speed >= 0 && speed <= 20) {
            speed = speed - 1;
        }
        else if(speed >= 21 && speed <= 30)
            speed = speed - 2;
        else if (speed >= 31 && speed <=40)
            speed = speed - 3;

        else speed = speed - 4;
    }

    public int speed() {
        return speed;
    }
}
