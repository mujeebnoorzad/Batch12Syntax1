package com.class29;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> fruit = new HashMap<>();
        fruit.put("Orange", 10);
        fruit.put("Apple", 1000);
        fruit.put("Banana", 15);


        Map<String, Integer> vegetable = new HashMap<>();
        vegetable.put("Potato", 12);
        vegetable.put("Tomato", 12);

        Map<String, Integer> grocers = new HashMap<>();
        grocers.putAll(fruit);
    }
}