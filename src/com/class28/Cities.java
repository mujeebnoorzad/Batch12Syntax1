package com.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

//Create a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with “A”;
public class Cities {
    public static void main(String[] args) {
        LinkedHashSet<String> city=new LinkedHashSet<>();
        city.add("San francisco");
        city.add("Sacramento");
        city.add("Austin");
        city.add("Atlanta");
        System.out.println(city);

        /*Iterator<String> it=city.iterator();
        while(it.hasNext()){
            if (it.next().startsWith("A")){
                it.remove();
            }
        }*/
        city.removeIf(s -> s.startsWith("A"));
        System.out.println(city);
    }
}
