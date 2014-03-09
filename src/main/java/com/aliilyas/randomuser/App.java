package com.aliilyas.randomuser;

import com.aliilyas.randomuserjava.pojo.RandomResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.*;
import java.util.Collection;
import javax.xml.ws.Response;

public class App {

    public static void main(String[] args) {
        System.out.println(Util.getRandomUser().getLocation().getCity());
    }
}
