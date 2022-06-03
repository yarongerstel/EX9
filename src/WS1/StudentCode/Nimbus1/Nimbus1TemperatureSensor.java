package WS1.StudentCode.Nimbus1;

import WS1.StudentCode.Observable.Sensor;
import WS1.StudentCode.Observers.TempratureAlarmListener;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Sensor {
    Random rnd = RandomSupplier.getRnd();


    public Nimbus1TemperatureSensor(String type, int interval) {
        super(type, interval);

        Nimbus1Clock.theInstance().register(interval,new TempratureAlarmListener(this));
        System.out.println("temperature registered to clock");

    }

    @Override
    public int read(){return rnd.nextInt(40);}




}
