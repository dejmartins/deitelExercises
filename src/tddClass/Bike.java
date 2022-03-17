package tddClass;

public class Bike {

    private int speed;
    private boolean isOn;

   /* public void turnOn(boolean on) {
        if (setOn == false)
            on = true;
        setOn = on;
    }

    public boolean isOn() {
        return setOn;
    }*/

    public void turnOn(boolean on) {
        isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }

    public void gearOneAccelerate(int speed) {
        speed = speed + 1;
        this.speed = speed;
    }

    public int speedLevel() {
        return speed;
    }

    public void gearTwoAccelerate(int speed) {
        speed = speed + 2;
        this.speed = speed;
    }

    public void gearThreeAccelerate(int speed) {
        speed = speed + 3;
        this.speed = speed;
    }

    public void gearFourAccelerate(int speed) {
        speed = speed + 4;
        this.speed = speed;
    }

    public void gearOneDeccelerate(int speed) {
        speed = speed - 1;
        this.speed = speed;
    }

    public void gearTwoDeccelerate(int speed) {
        speed = speed - 2;
        this.speed = speed;
    }

    public void gearThreeDeccelerate(int speed) {
        speed = speed - 3;
        this.speed = speed;
    }

    public void gearFourDeccelerate(int speed) {
        speed = speed - 4;
        this.speed = speed;
    }

    public void gearAccelerate() {
        if(speed < 0)
            speed = 0;
        else if (speed >= 0 && speed <= 20)
            speed = speed + 1;
        else if (speed >= 20 && speed <= 30)
            speed = speed + 2;
        else if (speed >= 31 && speed <= 40)
            speed = speed + 3;
        else speed = speed + 4;

        this.speed = speed;
    }


}