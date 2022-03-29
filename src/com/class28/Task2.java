package com.class28;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of words. Remove every word that ends with “e”.
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("Love");
        arrayList.add("Lahore");
        arrayList.add("cake");

        arrayList.removeIf(s -> s.toLowerCase().endsWith("e"));

       /* Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().endsWith("e")) {
                iterator.remove();
            }

        }*/
        System.out.println(arrayList);
    }
}