package com.class30;

import java.util.HashMap;
import java.util.LinkedHashSet;

//Create the collection that will store single uniques Objects of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection.
public class Task2 {
    public static void main(String[] args) {
      LinkedHashSet<String> set = new LinkedHashSet<>();
      set.add("Chocolate");
      set.add("Bread");
      set.add("Tea");
      set.add("Sugar");


      for(String s:set){
          System.out.print(s+" ");
      }


    }
}
