package WS1.StudentCode.Observable;

public abstract class Sensor extends Observable {
    int lastReading;
    int interval;
    String type;


    public Sensor(String type,int interval){
        this.interval = interval;
        this.type = type;
    }

    protected abstract int read();

    public void check(){
        int newRead = read();
        if(lastReading!=newRead) {
            lastReading = newRead;
            notifyObservers(newRead);
        }

    };

}
