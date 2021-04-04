package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean online;

    public Thermometer() {
        this.online = false;
    }

    @Override
    public boolean isOn() {
        return online;
    }

    @Override
    public void on() {
        online = true;
    }

    @Override
    public void off() {
        online = false;
    }

    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException();
        }

        return generateRandomValue();
    }

    private int generateRandomValue() {
        int high = 30;
        int low = -30;
        return new Random().nextInt(high - low) + low;
    }

}
