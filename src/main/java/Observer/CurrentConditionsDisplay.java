package Observer;

import java.text.DateFormat;
import java.util.Date;

class CurrentConditionsDisplay implements Observer {
    private String temperature;
    private String date;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    public void update(String temperature, String date) {
        this.temperature = temperature;
        this.date = date;
        display();
    }

    public void display() {
        System.out.println("Температура сьогодні: " + temperature);
        System.out.println("Сьогоднішня дата: " + date);
    }
}