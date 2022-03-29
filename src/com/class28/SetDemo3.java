package com.class28;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
       TreeSet<String> fruit=new TreeSet<>();
        fruit.add("z");
        fruit.add("a");
        fruit.add("n");
        fruit.add("m");
        fruit.add("z");
        System.out.println(fruit);
    }
}
