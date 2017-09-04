package tears.controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Igor Hnes on 8/17/17.
 */
public class ArticleController {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://github.com/PeterJames12/Vertex2");

        String name = "fwe,jhf";

        name.startsWith("https://");

        List<String> sitesOk = new LinkedList<>();
        sitesOk.add("");

        List<String> sitesBad = new LinkedList<>();
        sitesBad.add("vk.com");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        System.out.println(connection.getResponseCode());




    }
}
