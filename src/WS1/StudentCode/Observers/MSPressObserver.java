package WS1.StudentCode.Observers;

public class MSPressObserver implements Observer {
    MonitoringScreen screen;

    public MSPressObserver (MonitoringScreen aMS){
        this.screen = aMS;
    }
    public void update(int data){
        screen.displayPress(data);
    }
}
