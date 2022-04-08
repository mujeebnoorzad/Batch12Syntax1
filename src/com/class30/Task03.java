package com.class30;


import java.util.LinkedHashSet;
//Create a collection of integers in which you can keep duplicates.
//Write a logic to find sum of all integers

public class Task03 {
    public static void main(String[] args) {
       LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(35);
        set.add(45);
        set.add(65);
        set.add(80);

        int sum=0;
        for(Integer i:set){
            sum+=i;
        }
        System.out.println("find sum of all integers "+sum);
    }
}