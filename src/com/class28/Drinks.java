package com.class28;

import java.util.ArrayList;
//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class Drinks {
    public static void main(String[] args) {
        ArrayList<String> drink=new ArrayList<>();
        drink.add("milk");
        drink.add("coffee");
        drink.add("tea");
        drink.add("juice");
        System.out.println(drink);

        for(int i=0;i<drink.size();i++){
            if(drink.get(i).contains("a")||drink.get(i).contains("e")){
                drink.set(i,"water");
            }
        }
        System.out.println(drink);

    }
}
