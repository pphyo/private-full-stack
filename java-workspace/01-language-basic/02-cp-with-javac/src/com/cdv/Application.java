package com.cdv;

import org.json.simple.JSONObject;

public class Application {
    public static void main(String[] args) {
        var obj = new JSONObject();
        obj.put("name", "Adam");
        obj.put("gender", "Male");
        obj.put("age", 20);

        System.out.println(obj.toJSONString());
    }
}
