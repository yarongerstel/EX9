package WS1.StudentCode.System;


import WS1.StudentCode.Observable.WeatherMonitoringSystem;
import WS1.StudentCode.Observers.Log;
import WS1.StudentCode.Observers.MonitoringScreen;

public class MainClassWS1
{

    public static void main(String[] args) {
        WeatherMonitoringSystem ws = WeatherMonitoringSystem.theInstance();

        MonitoringScreen p_MonitorScreen = new MonitoringScreen(ws);
        Log p_log = new Log(ws);
        
    }
}
