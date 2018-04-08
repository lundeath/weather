package Observer;

import java.text.DateFormat;
import java.util.*;

class WeatherData implements Observable {
    private List<Observer> observers;
    private String temperature;
    private String date;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }


    public void registerObserver(Observer o) {
        observers.add(o);
    }


    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(temperature, date);
    }

    public void setMeasurements(String temperature, String date) {
        this.temperature = temperature;
        this.date = date;
        notifyObservers();
    }
}
