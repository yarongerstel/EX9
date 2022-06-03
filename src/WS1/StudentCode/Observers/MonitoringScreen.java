package WS1.StudentCode.Observers;

import WS1.StudentCode.Observable.WeatherMonitoringSystem;

public class MonitoringScreen {

    public MonitoringScreen(WeatherMonitoringSystem wm){
        System.out.println("MonitoringScreen was created");
        wm.temperatureSensor.addObserver(new MSTempObserver(this));
        System.out.println("MSTempObserver observes temperature");
        wm.pressureSensor.addObserver(new MSPressObserver(this));
        System.out.println("MSPressObserver observes pressure");
    }
    public void displayPress(int data) {
        System.out.println("MonitoringScreen: pressure = "+data +" millibars");
    }
    public void displayTemp(int data) {
        System.out.println("MonitoringScreen: temperature = "+data +" Celsius");
    }




}
