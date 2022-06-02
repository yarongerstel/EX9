package WS1.StudentCode.Observers;

import WS1.StudentCode.Observable.WeatherMonitoringSystem;

public class MonitoringScreen {
    WeatherMonitoringSystem itsWetherSystem;
    public MonitoringScreen(WeatherMonitoringSystem wm){
        itsWetherSystem = wm;
    }
    public void displayPress(int data) {
        System.out.println("MonitoringScreen: pressure = "+data +" millibars");
    }
    public void displayTemp(int data) {
        System.out.println("MonitoringScreen: temperature = "+data +" Celsius");
    }




}
