package com.class28;

import java.util.ArrayList;
import java.util.Iterator;


//Create an arrayList of words. Remove every word that ends with “e”.
public class Words {
    public static void main(String[] args) {
        ArrayList<String> word=new ArrayList<>();
        word.add("apple");
        word.add("orange");
        word.add("banana");
        System.out.println(word);


        Iterator<String> it=word.iterator();
        while(it.hasNext()){
            if(it.next().endsWith("e")){
                it.remove();
            }
        }
        System.out.println(word);

    }
}
