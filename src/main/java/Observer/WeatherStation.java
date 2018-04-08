package Observer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherStation {
        public static void main(String[] args) throws Exception {
            Parser parser = new Parser();
            WeatherData weatherData = new WeatherData();
            CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
            weatherData.setMeasurements(parser.getTemp(), parser.getDate());
        }
    }

