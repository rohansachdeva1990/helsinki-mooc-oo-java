package application;

public class ConstantSensor implements Sensor {

    private int sensorValue;

    public ConstantSensor(int sensorValue) {
        this.sensorValue = sensorValue;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return sensorValue;
    }
}
