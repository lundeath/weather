package Observer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parser implements Parseable{
    private Document page;
    //Parsing page
    public Document getPage() throws IOException {
        String url = "https://www.meteoprog.ua/ru/weather/Lviv/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    //Parsing temperature from page
    public String getTemp() throws IOException {
        Document page = getPage();
        //CSS query language
        return page.select("span[class=temperature_value]").first().text();
    }

    public String getDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM");
        return dateFormat.format(new Date());
    }
}
