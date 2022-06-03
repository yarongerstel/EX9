package WS1.StudentCode.Observers;

public class LogPressTrendObserver implements Observer{
    Log log;
    public LogPressTrendObserver(Log log) {
        this.log = log;
        System.out.println("LogPressTrendObserver was created");
    }
    public void update(int data){
        log.displayTrend(data);
    }

}
