package WS1.StudentCode.Observers;

public class MSTempObserver implements Observer {
    MonitoringScreen screen;

    public MSTempObserver (MonitoringScreen aMS){
        this.screen = aMS;
    }
    public void update(int data){
        screen.displayTemp(data);
    }
}
