package com.class30;

import java.util.*;

public class HashDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> fruitMap=new LinkedHashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Banana",12.5);

        Set<String> keys=fruitMap.keySet();
        System.out.println(keys);


        Iterator<String> iterator=keys.iterator();
        while(iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);
    }
}
