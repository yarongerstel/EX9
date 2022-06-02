package WS1.StudentCode.Observers;

import WS1.StudentCode.Observable.AlarmListener;
import WS1.StudentCode.Observable.Sensor;

public class TempratureAlarmListener implements AlarmListener {

    private Sensor itsTemp;

    public TempratureAlarmListener(Sensor temp)
    {
        itsTemp = temp;
    }
    @Override
    public void wakeUp() {
        itsTemp.check();
    }
}
