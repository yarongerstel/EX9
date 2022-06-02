package WS1.StudentCode.Observable;

public class AlarmClockRecord {
    int interval;
    int remainingTime;

    AlarmListener al = null;
    public AlarmClockRecord(int interval, AlarmListener pal) {
        remainingTime = this.interval = interval;
        this.al = pal;
    }
}
