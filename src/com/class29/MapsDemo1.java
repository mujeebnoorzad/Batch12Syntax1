package com.class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
       names.add("Asghar Nazir");
        names.add("Mohammad");
        System.out.println(names.get(0));


        HashMap<Integer,String> map=new HashMap<>();
        map.put(12345678,"Asghar Nazir");
        map.put(12567,"Mohammad");
        System.out.println(map.get(12345678));


        HashMap<String,String> groceries=new HashMap<>();
        groceries.put("Lilly","Egg,Milk,Bread etc");
        groceries.put("Tyfur","Camel,Horse etc");
        groceries.put("Asghar","Macbook,Milk,Iphone etc");
        System.out.println(groceries.get("Lilly"));

    }
}
