package WS1.StudentCode.Observers;

import WS1.StudentCode.Observable.WeatherMonitoringSystem;

public class MonitoringScreen {

    public MonitoringScreen(WeatherMonitoringSystem wm){
        wm.temperatureSensor.addObserver(new MSTempObserver(this));
        wm.pressureSensor.addObserver(new MSPressObserver(this));
    }
    public void displayPress(int data) {
        System.out.println("MonitoringScreen: pressure = "+data +" millibars");
    }
    public void displayTemp(int data) {
        System.out.println("MonitoringScreen: temperature = "+data +" Celsius");
    }




}
