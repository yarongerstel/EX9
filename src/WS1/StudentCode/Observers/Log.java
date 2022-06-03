package WS1.StudentCode.Observers;

import WS1.StudentCode.Observable.WeatherMonitoringSystem;

public class Log {

    public Log(WeatherMonitoringSystem wm)
    {
        System.out.println("Log was created");
        wm.pressureSensor.addObserver(new LogPressObserver(this));
        System.out.println("LogPressObserver observes pressure");
        wm.pressureTrendSensor.addObserver(new LogPressTrendObserver(this));
        System.out.println("LogPressTrendObserver observes pressure trend");
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
