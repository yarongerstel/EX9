package WS1.StudentCode.Observers;

import WS1.StudentCode.Observable.WeatherMonitoringSystem;

public class Log {
    WeatherMonitoringSystem itsWetherSystem;

    public Log(WeatherMonitoringSystem wm)
    {
        itsWetherSystem = wm;
    }
    public void displayPress(int data) {
        System.out.println("Log: pressure = "+data +" millibars");
    }
    public void displayTrend(int data) {
        switch (data){
            case 1:
                System.out.println("Log: pressure trend = STABLE");
                break;
            case 2:
                System.out.println("Log: pressure trend = FALLING");
                break;
            case 3:
                System.out.println("Log: pressure trend = RISING");
                break;
        }

    }
}
