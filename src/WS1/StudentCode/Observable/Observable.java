package WS1.StudentCode.Observable;

import WS1.StudentCode.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    List<Observer> itsObserver=new ArrayList<>();

    void notifyObservers(int data){
        for (Observer obs:itsObserver)
        {
            obs.update(data);
        }
    }

    public void addObserver(Observer obs){

        itsObserver.add(obs);
    }
    public void removeObserver(Observer obs)
    {
        itsObserver.remove(obs);
    }

}
