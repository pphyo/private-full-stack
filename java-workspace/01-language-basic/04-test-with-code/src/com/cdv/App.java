package com.cdv;

import org.json.simple.*;

public class App {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {

        var json = new JSONObject();
        json.put("name", "Claude");
        json.put("gender", "Male");

        System.out.println(json.toJSONString());

    }

}
