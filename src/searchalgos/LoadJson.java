/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

/**
 *
 * @author Terraformer
 */
public class LoadJson {
    
    String Json_url = "https://ajax.googleapis.com/ajax/services/feed/load?v=2.0&q="; // + rss url
    
    public static void main (String [] args) throws MalformedURLException, IOException{
        URL url = new URL("https://ajax.googleapis.com/ajax/services/feed/find?"
                + "v=1.0&q=Official%20Google%20Blog&userip=192.168.1.56");
        URLConnection connection = url.openConnection();
        connection.addRequestProperty("Referer","http://www.punchng.com/feed/");

        String line;
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }

        JSONObject json = new JSONObject(builder.toString());
    }
    
}
