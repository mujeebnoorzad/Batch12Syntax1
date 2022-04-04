package com.class30;
//Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map

import java.util.HashMap;

public class Building {
    public static void main(String[] args) {
        HashMap<Integer,String> floorN=new HashMap<>();
        floorN.put(1,"Amazon");
        floorN.put(2,"Apple");
        floorN.put(3,"Ebay");
        floorN.put(4,"Target");
        floorN.put(5,"Amazon");
        floorN.put(6,"Google");
        floorN.put(6,"Ebay");


        System.out.println(floorN.size());
        System.out.println(floorN);
        floorN.replace(4,"Facebook");
        System.out.println(floorN);

        floorN.remove(3,"Ebay");
        System.out.println(floorN);
    }
}
