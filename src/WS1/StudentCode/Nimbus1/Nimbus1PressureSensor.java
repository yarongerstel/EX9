package WS1.StudentCode.Nimbus1;

import WS1.StudentCode.Observable.AlarmClock;
import WS1.StudentCode.Observable.Sensor;
import WS1.StudentCode.Observers.PressureAlarmListener;
import WS1.StudentCode.Observers.TempratureAlarmListener;

import java.util.Random;

public class Nimbus1PressureSensor extends Sensor {
    Random rnd = RandomSupplier.getRnd();
    public Nimbus1PressureSensor(String type, int interval) {
        super(type, interval);
       Nimbus1Clock.theInstance().register(interval,new PressureAlarmListener(this));
    }

    @Override
    protected int read() {
        return rnd.nextInt(100)+950;
    }
}
