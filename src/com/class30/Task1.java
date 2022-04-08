package com.class30;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Create a Map that will store Employee name and salary.
// Write a logic to retrieve an employee who gets the highest salary.
// Output should be in the below format
//John Smith=$100000
public class Task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> nameSalary = new HashMap<>();
        nameSalary.put("Ahmad",80000);
        nameSalary.put("Mohammad",90000);
        nameSalary.put("Omar",100000);
        nameSalary.put("Khan",80000);

        Integer salaryS= Collections.max(nameSalary.values());
        for(Map.Entry<String,Integer> m:nameSalary.entrySet()){
            if(m.getValue()==salaryS){
                System.out.println(m.getKey()+" = "+m.getValue());
            }
        }

    }
}
