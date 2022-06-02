package WS1.StudentCode.Observable;

import WS1.StudentCode.Nimbus1.Nimbus1Clock;
import WS1.StudentCode.Nimbus1.Nimbus1PressureSensor;
import WS1.StudentCode.Nimbus1.Nimbus1TemepratureSensor;

public class WeatherMonitoringSystem {
        public Sensor temperatureSensor;
        public Sensor pressureSensor;
        public PressureTrendSensor pressureTrendSensor;
        private static WeatherMonitoringSystem wm = null;


        private WeatherMonitoringSystem()
        {
           temperatureSensor = new Nimbus1TemepratureSensor("Temperature",700);
           pressureSensor = new Nimbus1PressureSensor("Pressure",1100);
           pressureTrendSensor = new PressureTrendSensor();
          // AlarmClock NimbusClock= Nimbus1Clock.theInstance();

        }

        public static WeatherMonitoringSystem theInstance()
        {
            if ( wm == null)
                wm = new WeatherMonitoringSystem();
            return wm;
        }
    }

