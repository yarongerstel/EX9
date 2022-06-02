package WS1.StudentCode.Observable;

import WS1.StudentCode.Observers.Observer;

public class PressureTrendSensor extends Observable implements Observer {
    int lastReading1 = 0;
    int lastReading2 = 0;
    int lastReading3 = 0;
    int pressureState;
    int lastState = 1;

    public void calc() {
        if (lastReading1 < lastReading2 && lastReading2 < lastReading3)
            pressureState = 3;

        else if (lastReading1 > lastReading2 && lastReading2 > lastReading3)
            pressureState = 2;
        else
            pressureState = 1;
    }

    public void check() {
        calc();
        if (lastState != pressureState) {
            lastState = pressureState;
            notifyObservers(pressureState);
            }
        }

    public void update(int new_val) {
        lastReading1 = lastReading2;
        lastReading2 = lastReading3;
        lastReading3 = new_val;
        check();
    }
}
