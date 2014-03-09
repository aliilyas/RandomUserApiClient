/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aliilyas.randomuser;

import com.google.gson.Gson;
import com.aliilyas.randomuserjava.pojo.RandomResponse;
import com.aliilyas.randomuserjava.pojo.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Ilyas
 */
public class Util {

    public static final String URL = "http://api.randomuser.me/";

    public static String getContent(String urlToRead) {
        String line;
        String result = "";
        try {
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((line = rd.readLine()) != null) {
                result += line;
            }
            rd.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static RandomResponse getRandomResponse() {
        String s = Util.getContent(URL);
        Gson gson = new Gson();
        return gson.fromJson(s, RandomResponse.class);
    }

    public static User getRandomUser() {
        return getRandomResponse()
                .getResults()
                .get(0)
                .getUser();
    }

}
