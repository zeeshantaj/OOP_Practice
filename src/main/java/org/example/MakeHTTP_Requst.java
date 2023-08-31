package org.example;

import java.net.HttpURLConnection;
import java.net.URL;

public class MakeHTTP_Requst {
    public static void main(String[] args) {

        try {
            URL url = new URL("");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();


            connection.setRequestMethod("GET");


        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
