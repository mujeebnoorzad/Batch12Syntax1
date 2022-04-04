package com.class28;

import java.util.ArrayList;
import java.util.Iterator;
//Create an arraylist of cars and retrieve all the values using 3 different ways.
public class Cars {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Hunda");
        cars.add("Ford");

        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("***");

        for(String car:cars){
            System.out.print(car+" ");
        }
        System.out.println("***");

        for(int i=0; i< cars.size();i++){
            System.out.print(cars.get(i)+" ");
        }
    }
}