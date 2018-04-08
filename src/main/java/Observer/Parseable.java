package Observer;

import org.jsoup.nodes.Document;

import java.io.IOException;

public interface Parseable {
    Document getPage() throws IOException;
    String getTemp() throws IOException;
    String getDate();
}
