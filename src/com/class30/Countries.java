package com.class30;
//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Countries {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("American", "Washington, D.C");
        countries.put("Afghanistan", "Kabul");
        countries.put("India", "New Delhi");
        countries.put("Turkey", "Ankara");

        System.out.println(countries.entrySet());
        for (Map.Entry<String, String> entry : countries.entrySet()
        ) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }


        Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry);


        }
        for (String value : countries.values()) {
            System.out.println(value);
        }

        Iterator<String> iterator1 = countries.values().iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
