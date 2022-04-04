package com.class28;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class NameArrayList {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");


        LinkedHashSet<String>  hasS=new LinkedHashSet<>(aList);
        aList=new ArrayList<>(hasS);
        System.out.println(aList);
    }
}
