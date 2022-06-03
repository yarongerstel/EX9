package WS1.StudentCode.Observers;

public class LogPressObserver implements Observer{
    Log log;
    public LogPressObserver(Log log) {
        this.log = log;
    }
    public void update(int data){
        log.displayPress(data);
    }

}
