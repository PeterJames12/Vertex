package tears.controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class ArticleController {

    public static void main(String[] args) throws IOException {





        URL url = new URL("https://github.com/PeterJames12/Vertex2");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        System.out.println(connection.getResponseCode());
        
    }
}
