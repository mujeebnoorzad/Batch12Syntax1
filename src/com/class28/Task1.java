package com.class28;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // Create an ArrayList that will store 5 names into it.
//Find out whether the given ArrayList is empty or not?
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that

        ArrayList<String> names = new ArrayList<>();

        names.add("Zakirullah");
        names.add("Emilia");
        names.add("Mila");
        names.add("Cece");
        names.add("Basir");

        System.out.println("Is the names array list empty? " + names.isEmpty());
        System.out.println("Zakirullah is present? " + names.contains("Zakirullah"));
        System.out.println("Size of names Array List? " + names.size());
        System.out.println(names);
    }
    }

