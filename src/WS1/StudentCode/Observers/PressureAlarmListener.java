package WS1.StudentCode.Observers;

import WS1.StudentCode.Observable.AlarmListener;
import WS1.StudentCode.Observable.Sensor;

public class PressureAlarmListener implements AlarmListener {

    private Sensor itsPressure;

    public PressureAlarmListener(Sensor pressure)
    {
        itsPressure = pressure;
    }
    @Override
    public void wakeUp() {
        itsPressure.check();
    }
}
