package com.company;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.*;

public class sampp {
    static {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("name", "Mars");
        data.put("age", 32);
        data.put("city", "NY");
        Gson gson = new Gson();
        String json = gson.toJson(data);
    }
}
