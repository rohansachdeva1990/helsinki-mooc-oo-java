package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> additionalSensors = new ArrayList<Sensor>();
    private List<Integer> readings = new ArrayList<Integer>();

    @Override
    public boolean isOn() {
        for (Sensor additionalSensor : additionalSensors) {
            if (!additionalSensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor additionalSensor : additionalSensors) {
            additionalSensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor additionalSensor : additionalSensors) {
            additionalSensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException();
        }

        return averageMeasuredValue();
    }

    private int averageMeasuredValue() {
        int sum = 0;
        for (Sensor sensor : additionalSensors) {
            sum += sensor.measure();
        }
        int reading = (int) Math.floor(sum / additionalSensors.size());
        readings.add(reading);
        return reading;
    }

    public void addSensor(Sensor additional) {
        this.additionalSensors.add(additional);
    }

    public List<Integer> readings() {
        return readings;
    }
}
