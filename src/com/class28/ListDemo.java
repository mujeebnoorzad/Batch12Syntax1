package com.class28;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("10");
        arrayList.add("name");
        //arrayList.add(12.5);
       // arrayList.add(true);

                for (int i=0; i <arrayList.size(); i++){
                    System.out.println(((String)arrayList.get(i)).length());
                }
        System.out.println(arrayList);
    }

}
