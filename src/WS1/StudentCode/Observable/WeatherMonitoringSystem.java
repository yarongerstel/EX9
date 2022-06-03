package WS1.StudentCode.Observable;

import WS1.StudentCode.Nimbus1.Nimbus1PressureSensor;
import WS1.StudentCode.Nimbus1.Nimbus1TemperatureSensor;

public class WeatherMonitoringSystem {
    public Sensor temperatureSensor;
    public Sensor pressureSensor;
    public PressureTrendSensor pressureTrendSensor;
    private static WeatherMonitoringSystem wm = null;


    private WeatherMonitoringSystem() {
        System.out.println("WeatherMonitoringSystem was created");

        pressureSensor = new Nimbus1PressureSensor("Pressure", 1100);
        temperatureSensor = new Nimbus1TemperatureSensor("Temperature", 700);
        pressureTrendSensor = new PressureTrendSensor(pressureSensor);

    }

    public static WeatherMonitoringSystem theInstance() {
        if (wm == null)
            wm = new WeatherMonitoringSystem();
        return wm;
    }
}

